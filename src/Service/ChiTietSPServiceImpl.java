/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DomainModel.ChiTietSanPham;
import Repository.ChiTietSPRepository;
import Repository.ChiTietSPRepositoryImpl;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ChiTietSPServiceImpl implements ChiTietSPService{

    private ChiTietSPRepository repos = new ChiTietSPRepositoryImpl();
    @Override
    public List<ChiTietSanPham> getList() {
        return repos.getList();
    }

    @Override
    public String add(ChiTietSanPham ctsp) {
        boolean addCTSP = repos.add(ctsp);
        if (addCTSP) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, ChiTietSanPham ctsp) {
        boolean updateCTSP = repos.update(id,ctsp);
        if (updateCTSP) {
            return "Sửa thành công id" + id;
        }
        return "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
         boolean deleteCTSP = repos.delete(id);
        if (deleteCTSP) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }
    
}
