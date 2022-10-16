/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.HoaDon;
import Utils.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoaDonRepositoryImpl implements HoaDonRepository {

    private Connection conn;
    private ResultSet rs;
    private PreparedStatement ps;

    public HoaDonRepositoryImpl() {
        conn = JDBCUtils.getConnection();
    }

    @Override
    public List<HoaDon> getList() {
        try {
            List<HoaDon> lsthd = new ArrayList<>();
            String sql = "select * from HoaDon";
            ps = conn.prepareStatement(sql);
            ps.executeQuery();
            rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String idkh = rs.getString("IdKH");
                String idnv = rs.getString("IdNV");
                String ma = rs.getString("Ma");
                String ngaytao = rs.getString("NgayTao");
                String ngaythantoan = rs.getString("NgayThanhToan");
                String ngayship = rs.getString("NgayShip");
                String ngaynhan = rs.getString("NgayNhan");
                String tinhtrang = rs.getString("TenNguoiNhan");
                Integer tennguoinhan = rs.getInt("TinhTrang");
                String diachi = rs.getString("DiaChi");
                String sdt = rs.getString("Sdt");

                HoaDon hd = new HoaDon(id, idkh, idnv, ma, ngaytao, ngaythantoan, ngayship, ngaynhan, tennguoinhan, ngaynhan, diachi, sdt);
                lsthd.add(hd);
            }
            return lsthd;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(HoaDon hd) {
        try {
            String sql = "insert into HoaDon(IdKH,IdNV,Ma,NgayTao,NgayThanhToan,NgayShip,NgayNhan,TinhTrang,TenNguoiNhan,DiaChi,Sdt) values"
                    + "( ?,?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, hd.getIdKH());
            ps.setString(2, hd.getIdNV());
            ps.setString(3, hd.getMa());
            ps.setString(4, hd.getNgaytao());
            ps.setString(5, hd.getNgaythanhtoan());
            ps.setString(6, hd.getNgayship());
            ps.setString(7, hd.getNgaynhan());
            ps.setInt(8, hd.getTinhtrang());
            ps.setString(9, hd.getTennguoinhan());
            ps.setString(10, hd.getDiachi());
            ps.setString(11, hd.getSdt());

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(String id, HoaDon hd) {
        try {
            String sql = "update HoaDon"
                    + " set IdKH = ?,"
                    + " IdNV = ?,"
                    + " Ma = ?,"
                    + " NgayTao = ?,"
                    + " NgayThanhToan = ?,"
                    + " NgayShip = ?,"
                    + " NgayNhan = ?,"
                    + " TinhTrang = ?,"
                    + " TenNguoiNhan = ?,"
                    + " DiaChi = ?,"
                    + " Sdt = ?"
                    + " where Id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, hd.getIdKH());
            ps.setString(2, hd.getIdNV());
            ps.setString(3, hd.getMa());
            ps.setString(4, hd.getNgaytao());
            ps.setString(5, hd.getNgaythanhtoan());
            ps.setString(6, hd.getNgayship());
            ps.setString(7, hd.getNgaynhan());
            ps.setInt(8, hd.getTinhtrang());
            ps.setString(9, hd.getTennguoinhan());
            ps.setString(10, hd.getDiachi());
            ps.setString(11, hd.getSdt());
            ps.setString(12, id);

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        try {
            String sql = "delete from HoaDon"
                    + " where Id = ?";
            ps.setString(1, id);

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
