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
import DomainModel.CuaHang;

/**
 *
 * @author ADMIN
 */
public interface CuaHangRepository {
    List<CuaHang> getList();
    
    boolean add(CuaHang ch);
    
    boolean update(String id, CuaHang ch);
    
    boolean delete(String id);
//    private Connection conn;
//    private ResultSet rs;
//    private PreparedStatement ps;
//
//    public CuaHangRepository() {
//        conn = JDBCUtils.getConnection();
//    }
//    
//    public List<CuaHang> getList(){
//        try {
//            List<CuaHang> lstch = new ArrayList<>();
//            String sql = "select * from CuaHang";
//            ps = conn.prepareStatement(sql);
//            ps.executeQuery();
//            rs = ps.getResultSet();
//            while(rs.next()){
//                String idcv = rs.getString("Id");
//                String macv = rs.getString("Ma");
//                String tencv = rs.getString("Ten");
//                String diachi = rs.getString("DiaChi");
//                String thanhpho = rs.getString("ThanhPho");
//                String quocgia = rs.getString("QuocGia");
//                
//                CuaHang ch = new CuaHang(idcv, macv, tencv, diachi, thanhpho, quocgia);
//                lstch.add(ch);
//            }
//            return lstch;
//        } catch (SQLException ex) {
//            Logger.getLogger(ChucVuRepository.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//        }
//        return null;
//    }
//    
//    public boolean insert(CuaHang ch){
//        try {
//            String sql = "insert into CuaHang(Ma,Ten,DiaChi,ThanhPho,QuocGia) values"
//                    +"(?, ?,  ?, ?, ?)";
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, ch.getMach());
//            ps.setString(2, ch.getTench());
//            ps.setString(3, ch.getDiachi());
//            ps.setString(4, ch.getThanhpho());
//            ps.setString(5, ch.getQuocgia());
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
//            String sql = "delete from CuaHang"
//                    +" where Id = ?";
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
//    public boolean update(String id,CuaHang ch){
//        try {
//            String sql = "update CuaHang"
//                    +" set Ma = ?,"
//                    +" Ten = ?,"
//                    +" DiaChi = ?,"
//                    +" ThanhPho = ?,"
//                    +" QuocGia = ?"
//                    +" where Id = ?";
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, ch.getMach());
//            ps.setString(2, ch.getTench());
//            ps.setString(3, ch.getDiachi());
//            ps.setString(4, ch.getThanhpho());
//            ps.setString(5, ch.getQuocgia());
//            ps.setString(6, id);
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
}
