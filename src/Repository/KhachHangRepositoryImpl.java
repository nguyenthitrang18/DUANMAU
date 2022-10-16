/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.KhachHang;
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
public class KhachHangRepositoryImpl implements KhachHangRepository {

    private Connection conn;
    private ResultSet rs;
    private PreparedStatement ps;

    public KhachHangRepositoryImpl() {
        conn = JDBCUtils.getConnection();
    }

    @Override
    public List<KhachHang> getList() {
        try {
            List<KhachHang> lstkh = new ArrayList<>();
            String sql = "select * from KhachHang";
            ps = conn.prepareStatement(sql);
            ps.executeQuery();
            rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String dem = rs.getString("TenDem");
                String ho = rs.getString("Ho");
                Date ngaysinh = rs.getDate("NgaySinh");
                String sdt = rs.getString("Sdt");
                String diachi = rs.getString("DiaChi");
                String thanhpho = rs.getString("ThanhPho");
                String quocgia = rs.getString("QuocGia");
                String matkhau = rs.getString("MatKhau");

                KhachHang kh = new KhachHang(id, ma, ten, dem, ho, ngaysinh, sdt, diachi, thanhpho, quocgia, matkhau);
                lstkh.add(kh);
            }
            return lstkh;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(KhachHang kh) {
        try {
            String sql = "insert into KhachHang(Ma,Ten,TenDem,Ho,NgaySinh,Sdt,DiaChi,ThanhPho,QuocGia,MatKhau)values "
                    + "( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, kh.getMakh());
            ps.setString(2, kh.getTenkh());
            ps.setString(3, kh.getTendem());
            ps.setString(4, kh.getHo());
            java.sql.Date date = new java.sql.Date(kh.getNgaySinh().getTime());
            ps.setDate(5, date);
            ps.setString(6, kh.getSdt());
            ps.setString(7, kh.getDiachi());
            ps.setString(8, kh.getThanhpho());
            ps.setString(9, kh.getQuocgia());
            ps.setString(10, kh.getMatkhau());

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(String id, KhachHang kh) {
        try {
            String sql = "update KhachHang"
                    + " set Ma = ?,"
                    + " Ten = ?,"
                    + " TenDem = ?,"
                    + " Ho = ?,"
                    + " NgaySinh = ?,"
                    + " Sdt = ?,"
                    + " DiaChi = ?,"
                    + " ThanhPho = ?,"
                    + " QuocGia = ?,"
                    + " MatKhau = ?"
                    + " where Id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, kh.getMakh());
            ps.setString(2, kh.getTenkh());
            ps.setString(3, kh.getTendem());
            ps.setString(4, kh.getHo());
            java.sql.Date date = new java.sql.Date(kh.getNgaySinh().getTime());
            ps.setDate(5, date);
            ps.setString(6, kh.getSdt());
            ps.setString(7, kh.getDiachi());
            ps.setString(8, kh.getThanhpho());
            ps.setString(9, kh.getMatkhau());
            ps.setString(10, id);

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        try {
            String sql = "delete from KhachHang"
                    + " where Id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
