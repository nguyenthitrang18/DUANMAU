/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.HoaDon;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface HoaDonService {
    List<HoaDon> getList();

    String add(HoaDon hd);

    String update(String id, HoaDon hd);

    String delete(String id);
}
