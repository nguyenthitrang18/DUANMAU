/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.ChucVu;
import Repository.ChucVuRepository;
import Utils.JDBCUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ChucVuRepositpryImpl implements ChucVuRepository {

    private Connection conn;
    private ResultSet rs;
    private PreparedStatement ps;

    public ChucVuRepositpryImpl() {
        conn = JDBCUtils.getConnection();
    }

    @Override
    public List<ChucVu> getList() {
        try {
            List<ChucVu> lstcv = new ArrayList<>();
            String sql = "select * from ChucVu";
            ps = conn.prepareStatement(sql);
            ps.executeQuery();
            rs = ps.getResultSet();
            while (rs.next()) {
                String idcv = rs.getString("Id");
                String macv = rs.getString("Ma");
                String tencv = rs.getString("Ten");

                ChucVu cv = new ChucVu(idcv, macv, tencv);
                lstcv.add(cv);
            }
            return lstcv;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(ChucVu cv) {
        try {
            String sql = "insert into ChucVu(Ma,Ten) values"
                    + "(?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cv.getMa());
            ps.setString(2, cv.getTen());

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(String id, ChucVu cv) {
            try {
            String sql = "update ChucVu"
                    +" set Ma = ?,"
                    +" Ten = ?"
                    +" where Id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cv.getMa());
            ps.setString(2, cv.getTen());
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
            String sql = "delete from ChucVu"
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
