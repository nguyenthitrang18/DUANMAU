/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.NhanVien;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface NhanVienService {
    List<NhanVien> getList();

    String add(NhanVien nv);

    String update(String id, NhanVien nv);

    String delete(String id);
    
}
