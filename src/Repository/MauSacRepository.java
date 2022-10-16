/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Utils.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import DomainModel.MauSac;

/**
 *
 * @author ADMIN
 */
public interface MauSacRepository {
    List<MauSac> getList();
    
    boolean add(MauSac ms);

    boolean update(String id,MauSac ms);

    boolean delete(String id);
//    private Connection conn;
//    private ResultSet rs;
//    private PreparedStatement ps;
//
//    public MauSacRepository() {
//        conn = JDBCUtils.getConnection();
//    }
//    
//    public List<MauSac> getList(){
//        try {
//            List<MauSac> lstMS = new ArrayList<>();
//            String sql = "select * from MauSac";
//            ps = conn.prepareStatement(sql);
//            ps.executeQuery();
//            rs = ps.getResultSet();
//            while(rs.next()){
//                String idcv = rs.getString("Id");
//                String macv = rs.getString("Ma");
//                String tencv = rs.getString("Ten");
//                
//                MauSac mau = new MauSac(idcv, macv, tencv);
//                lstMS.add(mau);
//            }
//            return lstMS;
//        } catch (SQLException ex) {
//            Logger.getLogger(ChucVuRepository.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//        }
//        return null;
//    }
//    
//    public boolean insert(MauSac ms){
//        try {
//            String sql = "insert into MauSac(Ma,Ten) values"
//                    +"(?, ?)";
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, ms.getMaMS());
//            ps.setString(2, ms.getTenMS());
//            
//            return ps.executeUpdate() > 0;
//        } catch (SQLException ex) {
//            Logger.getLogger(ChucVuRepository.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//        }
//        return false;
//    }
//    
//    public boolean delete(String id){
//        try {
//            String sql = "delete from MauSac"
//                    +" where id = ?";
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, id);
//            
//            return ps.executeUpdate() > 0;
//        } catch (SQLException ex) {
//            Logger.getLogger(ChucVuRepository.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//        }
//        return false;
//    }
//    
//    
//    public boolean update(String id,MauSac ms){
//        try {
//            String sql = "update MauSac"
//                    +" set Ma = ?,"
//                    +" Ten = ?"
//                    +" where Id = ?";
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, ms.getMaMS());
//            ps.setString(2, ms.getTenMS());
//            ps.setString(3, id);
//            
//            return ps.executeUpdate() > 0;
//        } catch (SQLException ex) {
//            Logger.getLogger(ChucVuRepository.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//        }
//        return false;
//    }
//    
}
