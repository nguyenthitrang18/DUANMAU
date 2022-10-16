/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.HoaDon;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface HoaDonRepository {
    List<HoaDon> getList();
    
    boolean add(HoaDon hd);

    boolean update(String id,HoaDon hd);

    boolean delete(String id);
}
