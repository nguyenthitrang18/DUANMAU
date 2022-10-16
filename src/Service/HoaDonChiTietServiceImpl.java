/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.HoaDonChiTietRepository;
import Repository.KhachHangRepository;
import java.util.List;
import DomainModel.HoaDonChiTiet;
import Repository.HoaDonChiTietRepositoryImpl;

/**
 *
 * @author ADMIN
 */
public class HoaDonChiTietServiceImpl implements HoaDonChiTietService{
    private HoaDonChiTietRepository repos = new HoaDonChiTietRepositoryImpl();

    @Override
    public List<HoaDonChiTiet> getList() {
        return repos.getList();
    }

    @Override
    public String add(HoaDonChiTiet hdct) {
       boolean addHDCT = repos.add(hdct);
        if (addHDCT) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, HoaDonChiTiet hdct) {
         boolean updateHDCT = repos.update(id,hdct);
        if (updateHDCT) {
            return "Sửa thành công id" + id;
        }
        return "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
         boolean deleteHDCT = repos.delete(id);
        if (deleteHDCT) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

   
    
    
}
