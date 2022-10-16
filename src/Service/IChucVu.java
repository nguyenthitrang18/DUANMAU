/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.util.List;
import DomainModel.ChucVu;

/**
 *
 * @author ADMIN
 */
public interface IChucVu {
    List<ChucVu> getList();
    
    boolean insertSrv(ChucVu cv);
    
    boolean deleteSrv(String id);
    
    boolean updateSrv(String id,ChucVu cv);
}
