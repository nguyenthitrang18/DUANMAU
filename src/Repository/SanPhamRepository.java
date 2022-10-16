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
import DomainModel.SanPham;

/**
 *
 * @author ADMIN
 */
public interface SanPhamRepository {
    List<SanPham> getList();
    
    boolean add(SanPham sp);

    boolean update(String id,SanPham sp);

    boolean delete(String id);
//    private Connection conn;
//    private ResultSet rs;
//    private PreparedStatement ps;
//
//    public SanPhamRepository() {
//        conn = JDBCUtils.getConnection();
//    }
//    
//    public List<SanPham> getList(){
//        try {
//            List<SanPham> lstsp = new ArrayList<>();
//            String sql = "select * from SanPham";
//            ps = conn.prepareStatement(sql);
//            ps.executeQuery();
//            rs = ps.getResultSet();
//            while(rs.next()){
//                String id = rs.getString("Id");
//                String ma = rs.getString("Ma");
//                String ten = rs.getString("Ten");
//                
//                SanPham sp = new SanPham(id, ma, ten);
//                lstsp.add(sp);
//            }
//            return lstsp;
//        } catch (SQLException ex) {
//            Logger.getLogger(ChucVuRepository.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//        }
//        return null;
//    }
//    
//    public boolean insert(SanPham sp){
//        try {
//            String sql = "insert into SanPham(Ma,Ten) values"
//                    +"(?, ?)";
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, sp.getMasp());
//            ps.setString(2, sp.getTensp());
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
//            String sql = "delete from SanPham"
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
//    public boolean update(String id, SanPham sp){
//        try {
//            String sql = "update SanPham"
//                    +" set Ma = ?,"
//                    +" Ten = ?"
//                    +" where Id = ?";
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, sp.getMasp());
//            ps.setString(2, sp.getTensp());
//            ps.setString(3, id);
//            
//            return ps.executeUpdate() > 0;
//        } catch (SQLException ex) {
//            Logger.getLogger(ChucVuRepository.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//        }
//        return false;
//    }
    
}
