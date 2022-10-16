/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Utils.JDBCUtils;
import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import DomainModel.NhanVien;

/**
 *
 * @author ADMIN
 */
public interface NhanVienRepository {
    
    List<NhanVien> getList();
    
    boolean add(NhanVien nv);
    
    boolean update(String id, NhanVien nv);
    
    boolean delete(String id);
//    private java.sql.Connection conn;
//    private ResultSet rs;
//    private PreparedStatement ps;
//
//    public NhanVienRepository() {
//        conn = JDBCUtils.getConnection();
//    }
//
//    public List<NhanVien> getList() {
//        try {
//            List<NhanVien> lstnv = new ArrayList<>();
//            String sql = "select * from NhanVien";
//            ps = conn.prepareStatement(sql);
//            ps.executeQuery();
//            rs = ps.getResultSet();
//            while (rs.next()) {
//                String idbv = rs.getString("Id");
//                String manv = rs.getString("Ma");
//                String ten = rs.getString("Ten");
//                String dem = rs.getString("TenDem");
//                String ho = rs.getString("Ho");
//                String gt = rs.getString("GioiTinh");
//                Date ngaysinh = rs.getDate("NgaySinh");
//                String diachi = rs.getString("DiaChi");
//                String sdt = rs.getString("Sdt");
//                String matkhau = rs.getString("MatKhau");
//                String idCh = rs.getString("IdCH");
//                String idCv = rs.getString("IdCV");
//                String idBC = rs.getString("IdGuiBC");
//                Integer trangthai = rs.getInt("TrangThai");
//                
//                  NhanVien nv = new NhanVien(idCv, manv, ten, dem, ho, idCh, ngaysinh, diachi, sdt, matkhau, idCh, idCv, idBC, trangthai);
//                  lstnv.add(nv);
//            }
//            return lstnv;
//        } catch (SQLException ex) {
//            Logger.getLogger(ChucVuRepository.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//        }
//        return null;
//    }
}
