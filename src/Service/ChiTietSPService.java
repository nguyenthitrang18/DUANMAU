/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.ChiTietSanPham;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ChiTietSPService {
    List<ChiTietSanPham> getList();

    String add(ChiTietSanPham ctsp);

    String update(String id, ChiTietSanPham ctsp);

    String delete(String id);
}
