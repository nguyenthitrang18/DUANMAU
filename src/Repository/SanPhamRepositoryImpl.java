/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.SanPham;
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
public class SanPhamRepositoryImpl implements SanPhamRepository{
    
    private Connection conn;
    private ResultSet rs;
    private PreparedStatement ps;

    public SanPhamRepositoryImpl() {
        conn = JDBCUtils.getConnection();
    }
    
    

    @Override
    public List<SanPham> getList() {
                try {
            List<SanPham> lstsp = new ArrayList<>();
            String sql = "select * from SanPham";
            ps = conn.prepareStatement(sql);
            ps.executeQuery();
            rs = ps.getResultSet();
            while(rs.next()){
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                
                SanPham sp = new SanPham(id, ma, ten);
                lstsp.add(sp);
            }
            return lstsp;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(SanPham sp) {
                try {
            String sql = "insert into SanPham(Ma,Ten) values"
                    +"(?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, sp.getMasp());
            ps.setString(2, sp.getTensp());
            
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(String id, SanPham sp) {
                try {
            String sql = "update SanPham"
                    +" set Ma = ?,"
                    +" Ten = ?"
                    +" where Id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, sp.getMasp());
            ps.setString(2, sp.getTensp());
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
            String sql = "delete from SanPham"
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
