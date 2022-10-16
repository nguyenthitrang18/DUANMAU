/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.DongSP;
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
public class DongSPRepositoryImpl implements DongSPRepository {

    private Connection conn;
    private ResultSet rs;
    private PreparedStatement ps;

    public DongSPRepositoryImpl() {
        conn = JDBCUtils.getConnection();
    }

    @Override
    public List<DongSP> getList() {
        try {
            List<DongSP> lstDG = new ArrayList<>();
            String sql = "select * from DongSP";
            ps = conn.prepareStatement(sql);
            ps.executeQuery();
            rs = ps.getResultSet();
            while (rs.next()) {
                String idcv = rs.getString("Id");
                String macv = rs.getString("Ma");
                String tencv = rs.getString("Ten");

                DongSP dg = new DongSP(idcv, macv, tencv);
                lstDG.add(dg);
            }
            return lstDG;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(DongSP dsp) {
        try {
            String sql = "insert into DongSP(Ma,Ten) values"
                    + "(?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, dsp.getMaDG());
            ps.setString(2, dsp.getTenDG());

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(String id, DongSP dsp) {
        try {
            String sql = "update DongSP"
                    + " set Ma = ?,"
                    + " Ten = ?"
                    + " where Id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, dsp.getMaDG());
            ps.setString(2, dsp.getTenDG());
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
            String sql = "delete from DongSP"
                    + " where id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
