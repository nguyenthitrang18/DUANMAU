/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.NSX;
import Utils.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NSXRepositoryImpl implements NSXRepository{

    private Connection conn;
    private ResultSet rs;
    private PreparedStatement ps;

    public NSXRepositoryImpl() {
        conn = JDBCUtils.getConnection();
    }

    
    @Override
    public List<NSX> getList() {
                try {
            List<NSX> lstNSX = new ArrayList<>();
            String sql = "select * from NSX";
            ps = conn.prepareStatement(sql);
            ps.executeQuery();
            rs = ps.getResultSet();
            while(rs.next()){
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                
                NSX nsx = new NSX(id, ma, ten);
                lstNSX.add(nsx);
            }
            return lstNSX;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(NSX nsx) {
               try {
            String sql = "insert into NSX(Ma,Ten) values"
                    +"(?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nsx.getMaNSX());
            ps.setString(2, nsx.getTenNSX());
            
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(String id, NSX nsx) {
                try {
            String sql = "update NSX"
                    +" set Ma = ?,"
                    +" Ten = ?"
                    +" where Id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nsx.getMaNSX());
            ps.setString(2, nsx.getTenNSX());
            ps.setString(3, id);
            
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
                try {
            String sql = "delete from NSX"
                    +" where id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
}
