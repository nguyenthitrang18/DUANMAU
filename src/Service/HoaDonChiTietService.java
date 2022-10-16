/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.HoaDonChiTiet;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface HoaDonChiTietService {
    
    List<HoaDonChiTiet> getList();

    String add(HoaDonChiTiet hdct);

    String update(String id, HoaDonChiTiet hdct);

    String delete(String id);
}
