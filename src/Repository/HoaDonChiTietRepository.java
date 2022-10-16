/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Utils.JDBCUtils;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import DomainModel.HoaDonChiTiet;

/**
 *
 * @author ADMIN
 */
public interface HoaDonChiTietRepository {
    List<HoaDonChiTiet> getList();
    
    boolean add(HoaDonChiTiet hdct);

    boolean update(String id,HoaDonChiTiet hdc);

    boolean delete(String id);
//    private Connection conn;
//    private ResultSet rs;
//    private PreparedStatement ps;
//
//    public HoaDonChiTietRepository() {
//        conn = JDBCUtils.getConnection();
//    }
//    
//    public List<HoaDonChiTiet> getList(){
//        try {
//            List<HoaDonChiTiet> lsthdct = new ArrayList<>();
//            String sql = "select * from HoaDonChiTiet";
//            ps = conn.prepareStatement(sql);
//            ps.executeQuery();
//            rs = ps.getResultSet();
//            while(rs.next()){
//                String idhd = rs.getString("IdHoaDon");
//                String mactsp = rs.getString("IdChiTietSP");
//                Integer soluong = rs.getInt("SoLuong");
//                BigDecimal diachi = rs.getBigDecimal("DonGia");
//                
//                
//               HoaDonChiTiet hdct = new HoaDonChiTiet(idhd, mactsp, soluong, diachi);
//               lsthdct.add(hdct);
//            }
//            return lsthdct;
//        } catch (SQLException ex) {
//            Logger.getLogger(ChucVuRepository.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//        }
//        return null;
//    }
//    
//    public boolean insert(HoaDonChiTiet hdct){
//        try {
//            String sql = "insert into HoaDonChiTiet values"
//                    +"(?, ?, ?, ?)";
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, hdct.getId());
//            ps.setString(2, hdct.getIdChiTietSP());
//            ps.setInt(3, hdct.getSoluong());
//            ps.setBigDecimal(4, hdct.getDongia());
//           
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
//            String sql = "delete from HoaDonChiTiet"
//                    +" where IdHoaDon = ?";
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
////    public boolean update(String id,CuaHang ch){
////        try {
////            String sql = "update CuaHang"
////                    +" set Ma = ?,"
////                    +" Ten = ?,"
////                    +" DiaChi = ?,"
////                    +" ThanhPho = ?,"
////                    +" QuocGia = ?"
////                    +" where Id = ?";
////            ps = conn.prepareStatement(sql);
////            ps.setString(1, ch.getMach());
////            ps.setString(2, ch.getTench());
////            ps.setString(3, ch.getDiachi());
////            ps.setString(4, ch.getThanhpho());
////            ps.setString(5, ch.getQuocgia());
////            ps.setString(6, id);
////            
////            return ps.executeUpdate() > 0;
////        } catch (SQLException ex) {
////            Logger.getLogger(ChucVuRepository.class.getName()).log(Level.SEVERE, null, ex);
////            ex.printStackTrace();
////        }
////        return false;
////    }
    
}
