/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Utils.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import DomainModel.DongSP;

/**
 *
 * @author ADMIN
 */
public interface DongSPRepository {
    
    List<DongSP> getList();
    
    boolean add(DongSP dsp);

    boolean update(String id,DongSP dsp);

    boolean delete(String id);
}
