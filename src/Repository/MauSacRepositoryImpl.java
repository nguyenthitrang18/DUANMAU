/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.MauSac;
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
public class MauSacRepositoryImpl implements MauSacRepository{
    
    private Connection conn;
    private ResultSet rs;
    private PreparedStatement ps;

    public MauSacRepositoryImpl() {
        conn = JDBCUtils.getConnection();
    }

    @Override
    public List<MauSac> getList() {
                try {
            List<MauSac> lstMS = new ArrayList<>();
            String sql = "select * from MauSac";
            ps = conn.prepareStatement(sql);
            ps.executeQuery();
            rs = ps.getResultSet();
            while(rs.next()){
                String idcv = rs.getString("Id");
                String macv = rs.getString("Ma");
                String tencv = rs.getString("Ten");
                
                MauSac mau = new MauSac(idcv, macv, tencv);
                lstMS.add(mau);
            }
            return lstMS;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(MauSac ms) {
        try {
            String sql = "insert into MauSac(Ma,Ten) values"
                    +"(?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ms.getMaMS());
            ps.setString(2, ms.getTenMS());
            
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(String id, MauSac ms) {
                try {
            String sql = "update MauSac"
                    +" set Ma = ?,"
                    +" Ten = ?"
                    +" where Id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ms.getMaMS());
            ps.setString(2, ms.getTenMS());
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
            String sql = "delete from MauSac"
                    +" where Id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
}
