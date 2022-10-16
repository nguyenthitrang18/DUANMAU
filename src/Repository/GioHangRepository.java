/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModel.GioHang;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface GioHangRepository {
    List<GioHang> getList();
    
    boolean add(GioHang gh);

    boolean update(String id,GioHang gh);

    boolean delete(String id);
}
