/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.NhanVien;
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
public class NhanVienRepositoryImpl implements NhanVienRepository{
    
    private Connection conn;
    private ResultSet rs;
    private PreparedStatement ps;
    

    public NhanVienRepositoryImpl() {
        conn = JDBCUtils.getConnection();
        
    }
    
    

    @Override
    public List<NhanVien> getList() {
                try {
            List<NhanVien> lstnv = new ArrayList<>();
            String sql = "select * from NhanVien";
            ps = conn.prepareStatement(sql);
            ps.executeQuery();
            rs = ps.getResultSet();
            while (rs.next()) {
                String idbv = rs.getString("Id");
                String manv = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String dem = rs.getString("TenDem");
                String ho = rs.getString("Ho");
                String gt = rs.getString("GioiTinh");
                Date ngaysinh = rs.getDate("NgaySinh");
                String diachi = rs.getString("DiaChi");
                String sdt = rs.getString("Sdt");
                String matkhau = rs.getString("MatKhau");
                String idCh = rs.getString("IdCH");
                String idCv = rs.getString("IdCV");
                Integer trangthai = rs.getInt("TrangThai");
                
                  NhanVien nv = new NhanVien(idCv, manv, ten, dem, ho, idCh, ngaysinh, diachi, sdt, matkhau, idCh, idCv, trangthai);
                  // new nv dc sử dụng khởi tạo đối tượng
                  lstnv.add(nv);
            }
            return lstnv;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(NhanVien nv) {
        try {
            String sql = "insert into NhanVien(Ma,Ten,TenDem,Ho,GioiTinh,NgaySinh,DiaChi,Sdt,MatKhau,IdCH,IdCV,TrangThai) values"
                    + "( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getManv());
            ps.setString(2, nv.getTennv());
            ps.setString(3, nv.getTendem());
            ps.setString(4, nv.getHo());
            ps.setString(5,nv.getGioitinh());
            java.sql.Date date = new java.sql.Date(nv.getNgaysinh().getTime());
            ps.setDate(6, date);
            ps.setString(7, nv.getDiachi());
            ps.setString(8, nv.getSdt());
            ps.setString(9, nv.getMatkhau());
            ps.setString(10, nv.getIdCH());
            ps.setString(11, nv.getIdCV());
            ps.setInt(12, nv.getTrangThai());

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(String id, NhanVien nv) {
            try {
            String sql = "update NhanVien"
                    + " set Ma = ?,"
                    + " Ten = ?,"
                    + " TenDem = ?,"
                    + " Ho = ?,"
                    + " GioiTinh = ?,"
                    + " NgaySinh = ?,"
                    + " DiaChi = ?,"
                    + " Sdt = ?,"
                    + " MatKhau = ?,"
                    + " IdCH = ?,"
                    + " IdCV = ?,"
                    + " TrangThai = ?"
                    + " where Id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getManv());
            ps.setString(2, nv.getTennv());
            ps.setString(3, nv.getTendem());
            ps.setString(4, nv.getHo());
            ps.setString(5,nv.getGioitinh());
            java.sql.Date date = new java.sql.Date(nv.getNgaysinh().getTime());
            ps.setDate(6, date);
            ps.setString(7, nv.getDiachi());
            ps.setString(8, nv.getSdt());
            ps.setString(9, nv.getMatkhau());
            ps.setString(10, nv.getIdCH());
            ps.setString(11, nv.getIdCV());
            ps.setInt(12, nv.getTrangThai());
            ps.setString(13, id);

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;    
    }

    @Override
    public boolean delete(String id) {
            try {
            String sql = "delete from NhanVien"
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
