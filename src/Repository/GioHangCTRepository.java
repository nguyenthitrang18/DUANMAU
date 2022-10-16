/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModel.GioHangChiTiet;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface GioHangCTRepository {
    List<GioHangChiTiet> getList();
    
//    boolean add(GioHangChiTiet ghct);
//
//    boolean update(String id,GioHangChiTiet ghct);
//
//    boolean delete(String id);
}
