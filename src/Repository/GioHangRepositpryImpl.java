///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Repository;
//
//import DomainModel.GioHang;
//import Utils.JDBCUtils;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// *
// * @author ADMIN
// */
//public class GioHangRepositpryImpl implements GioHangRepository{
//    private Connection conn;
//    private ResultSet rs;
//    private PreparedStatement ps;
//
//    public GioHangRepositpryImpl() {
//        conn = JDBCUtils.getConnection();
//    }
//    
//    
//    @Override
//    public List<GioHang> getList() {
//                try {
//            List<GioHang> lstgh = new ArrayList<>();
//            String sql = "select * from GioHang";
//            ps = conn.prepareStatement(sql);
//            ps.executeQuery();
//            rs = ps.getResultSet();
//            while (rs.next()) {
//                String idgh = rs.getString("Id");
//                String idKH = rs.getString("IdKH");
//                String idNV = rs.getString("IdNV");
//                String ma = rs.getString("Ma");
//                String Ngaytao = rs.getString("NgayTao");
//                String ngaythanhtoan = rs.getString("NgayThanhToan");
//                String tennguoinhan = rs.getString("TenNguoiNhan");
//                String diachi = rs.getString("DiaChi");
//                String sdt = rs.getString("Sdt");
//                Integer tinhtrang = rs.getInt("TinhTrang");
//
//                GioHang gh = new GioHang(sdt, idKH, idNV, ma, Ngaytao, ngaythanhtoan, tennguoinhan, diachi, sdt, tinhtrang);
//                lstgh.add(gh);
//            }
//            return lstgh;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return null;
//    }
//
//    @Override
//    public boolean add(GioHang gh) {
//                    String sql = "insert into GioHang(IdKH,IdNV,Ma,NgayTao,NgayThanhToan,TenNguoiNhan,DiaChi,Sdt,TinhTrang) values"
//                    + "(?, ?)";
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, cv.getMa());
//            ps.setString(2, cv.getTen());
//
//            return ps.executeUpdate() > 0;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return false;
//    }
//
//    @Override
//    public boolean update(String id, GioHang gh) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public boolean delete(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    
//}
