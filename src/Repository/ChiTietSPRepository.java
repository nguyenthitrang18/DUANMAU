/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModel.ChiTietSanPham;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ChiTietSPRepository {
    List<ChiTietSanPham> getList();
    
    boolean add(ChiTietSanPham ctsp);

    boolean update(String id,ChiTietSanPham ctsp);

    boolean delete(String id);
}
