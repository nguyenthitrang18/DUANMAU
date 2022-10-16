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
import DomainModel.NSX;

/**
 *
 * @author ADMIN
 */
public interface NSXRepository {
    
    List<NSX> getList();
    
    boolean add(NSX nsx);

    boolean update(String id,NSX nsx);

    boolean delete(String id);

    
}
