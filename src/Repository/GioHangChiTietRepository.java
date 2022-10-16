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
import DomainModel.ChiTietSanPham;
import DomainModel.GioHangChiTiet;

/**
 *
 * @author ADMIN
 */
public class GioHangChiTietRepository {
    private Connection conn;
    private ResultSet rs;
    private PreparedStatement ps;

    public GioHangChiTietRepository() {
        conn = JDBCUtils.getConnection();
    }
    
    public List<GioHangChiTiet> getList(){
        try {
            List<GioHangChiTiet> lsthdct = new ArrayList<>();
            String sql = "select * from GioHangChiTiet";
            ps = conn.prepareStatement(sql);
            ps.executeQuery();
            rs = ps.getResultSet();
            while(rs.next()){
                String idGioHang = rs.getString("IdGioHang");
                String idChiTietSP = rs.getString("IdChiTietSP");
                Integer soluong = rs.getInt("SoLuong");
                BigDecimal dongia = rs.getBigDecimal("DonGia");
                BigDecimal dongiakhigiam = rs.getBigDecimal("DonGiaKhiGiam");
                
                
                GioHangChiTiet gtct = new GioHangChiTiet(idGioHang, idChiTietSP, soluong, dongia, dongiakhigiam);
                lsthdct.add(gtct);
            }
            return lsthdct;
        } catch (SQLException ex) {
            Logger.getLogger(ChucVuRepository.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return null;
    }
    
}
