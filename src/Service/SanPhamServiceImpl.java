/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DomainModel.SanPham;
import Repository.SanPhamRepositoryImpl;
import Repository.SanPhamRepository;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class SanPhamServiceImpl implements SanPhamService{

    private SanPhamRepository repos = new SanPhamRepositoryImpl();

    @Override
    public List<SanPham> getList() {
        return repos.getList();
    }

    @Override
    public String add(SanPham sp) {
        boolean addSP = repos.add(sp);
        if (addSP) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, SanPham sp) {
        boolean updateSP = repos.update(id,sp);
        if (updateSP) {
            return "Sửa thành công id" + id;
        }
        return "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
        boolean deleteSP = repos.delete(id);
        if (deleteSP) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }
    
   
}
