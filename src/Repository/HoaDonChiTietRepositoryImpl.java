/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.HoaDonChiTiet;
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
public class HoaDonChiTietRepositoryImpl implements HoaDonChiTietRepository {

    private Connection conn;
    private ResultSet rs;
    private PreparedStatement ps;

    public HoaDonChiTietRepositoryImpl() {
        conn = JDBCUtils.getConnection();
    }
    
    

    @Override
    public List<HoaDonChiTiet> getList() {
        try {
            List<HoaDonChiTiet> lsthdct = new ArrayList<>();
            String sql = "select * from HoaDonChiTiet";
            ps = conn.prepareStatement(sql);
            ps.executeQuery();
            rs = ps.getResultSet();
            while (rs.next()) {
                String idhd = rs.getString("IdHoaDon");
                String mactsp = rs.getString("IdChiTietSP");
                Integer soluong = rs.getInt("SoLuong");
                Float diachi = rs.getFloat("DonGia");

                HoaDonChiTiet hdct = new HoaDonChiTiet(idhd, mactsp, soluong, diachi);
                lsthdct.add(hdct);
            }
            return lsthdct;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(HoaDonChiTiet hdct) {
        try {
            String sql = "insert into HoaDonChiTiet values"
                    + "( ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, hdct.getSoluong());
            ps.setFloat(2, hdct.getDongia());

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(String id, HoaDonChiTiet hdct) {
        try {
            String sql = "update HoaDonChiTiet"
                    + " set SoLuong = ? ,"
                    + " DonGia = ? "
                    + " where IdHoaDon = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, hdct.getSoluong());
            ps.setFloat(2, hdct.getDongia());
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
            String sql = "delete from HoaDonChiTiet"
                    + " where IdHoaDon = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
