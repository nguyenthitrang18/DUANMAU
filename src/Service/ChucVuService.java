/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.ChucVuRepository;
import java.util.List;
import DomainModel.ChucVu;

/**
 *
 * @author ADMIN
 */
public interface ChucVuService {
    
    List<ChucVu> getList();

    String add(ChucVu cv);

    String update(String id, ChucVu chucVu);

    String deleteSrv(String id);
    
    
}
