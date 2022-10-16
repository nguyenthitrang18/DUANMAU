/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.ChiTietSanPham;
import Utils.JDBCUtils;
import java.math.BigDecimal;
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
public class ChiTietSPRepositoryImpl implements ChiTietSPRepository{
    private Connection conn;
    private ResultSet rs;
    private PreparedStatement ps;

    public ChiTietSPRepositoryImpl() {
        conn = JDBCUtils.getConnection();
    }
    
    
    @Override
    public List<ChiTietSanPham> getList() {
                try {
            List<ChiTietSanPham> lstCTSP = new ArrayList<>();
            String sql = "select ctsp.Id, sp.Ten as TenSP, nsx.Ten as TenNSX,ms.Ten as TenMS,dsp.Ten as TenDSP,ctsp.NamBH,ctsp.MoTa,ctsp.SoLuongTon,ctsp.GiaNhap,ctsp.GiaBan\n" +
"from ChiTietSP as ctsp inner join SanPham as sp on ctsp.IdSP = sp.Id inner join\n" +
"NSX as nsx on ctsp.IdNsx = NSX.Id inner join MauSac as ms on ctsp.IdMauSac = ms.Id inner join DongSP as dsp\n" +
"on ctsp.IdDongSP = dsp.Id";
            ps = conn.prepareStatement(sql);
            ps.executeQuery();
            rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String idsp = rs.getString("IdSP");
                String idnsx = rs.getString("IdNsx");
                String idms = rs.getString("IdMauSac");
                String idongsp = rs.getString("IdDongSP");
                Integer nam = rs.getInt("NamBH");
                String mota = rs.getString("MoTa");
                Integer slg = rs.getInt("SoLuongTon");
                Float gianhap = rs.getFloat("GiaNhap");
                Float giaban = rs.getFloat("GiaBan");

                ChiTietSanPham ctsp = new ChiTietSanPham(id, idsp, idnsx, idms, idongsp, nam, mota, slg, gianhap, giaban);
                lstCTSP.add(ctsp);
            }
            return lstCTSP;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(ChiTietSanPham ctsp) {
               try {
            String sql = "insert into ChiTietSP(IdSP,IdNsx,IdMauSac,IdDongSP,NamBH,MoTa,SoLuongTon,GiaNhap,GiaBan) values"
                    + "( ?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ctsp.getIdSP());
            ps.setString(2, ctsp.getIdNSX());
            ps.setString(3, ctsp.getIdMausac());
            ps.setString(4, ctsp.getIdDongiasp());
            ps.setInt(5, ctsp.getNamBH());
            ps.setString(6, ctsp.getMota());
            ps.setInt(7, ctsp.getSoluongton());
            ps.setFloat(8, ctsp.getGianhap());
            ps.setFloat(9, ctsp.getGiaban());

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(String id, ChiTietSanPham ctsp) {
              try {
            String sql = "update ChiTietSP"
                    + " set IdSP = ?,"
                    + " IdNsx = ?,"
                    + " IdMauSac = ?,"
                    + " IdDongSP = ?,"
                    + " NamBH = ?,"
                    + " MoTa = ?,"
                    + " SoLuongTon = ?,"
                    + " GiaNhap = ?,"
                    + " GiaBan = ?"
                    + " where Id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ctsp.getIdSP());
            ps.setString(2, ctsp.getIdNSX());
            ps.setString(3, ctsp.getIdMausac());
            ps.setString(4, ctsp.getIdDongiasp());
            ps.setInt(5, ctsp.getNamBH());
            ps.setString(6, ctsp.getMota());
            ps.setInt(7, ctsp.getSoluongton());
            ps.setFloat(8, ctsp.getGianhap());
            ps.setFloat(9, ctsp.getGiaban());
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
            String sql = "delete from ChiTietSP"
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
