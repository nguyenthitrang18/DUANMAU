/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DomainModel.NhanVien;
import Repository.NhanVienRepository;
import Repository.NhanVienRepositoryImpl;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NhanVienServiceImpl implements NhanVienService{
    
    private NhanVienRepository repos = new NhanVienRepositoryImpl();

    @Override
    public List<NhanVien> getList() {
        return repos.getList();
    }

    @Override
    public String add(NhanVien nv) {
        boolean addNV = repos.add(nv);
        if (addNV) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, NhanVien nv) {
        boolean updateNV = repos.update(id,nv);
        if (updateNV) {
            return "Sửa thành công id" + id;
        }
        return "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
        boolean deleteNV = repos.delete(id);
        if (deleteNV) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }
    
}
