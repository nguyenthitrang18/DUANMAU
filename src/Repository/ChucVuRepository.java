/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;


import Utils.JDBCUtils;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import DomainModel.ChucVu;

/**
 *
 * @author ADMIN
 */
public interface ChucVuRepository {
    List<ChucVu> getList();
    
    boolean add(ChucVu cv);

    boolean update(String id,ChucVu cv);

    boolean delete(String id);
}
