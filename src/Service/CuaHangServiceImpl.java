/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DomainModel.CuaHang;
import Repository.CuaHangRepository;
import Repository.CuaHangRepositoryImpl;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class CuaHangServiceImpl implements CuaHangService{
    private CuaHangRepository repos = new CuaHangRepositoryImpl();

    @Override
    public List<CuaHang> getList() {
        return repos.getList();
    }

    @Override
    public String add(CuaHang ch) {
        boolean addCH = repos.add(ch);
        if (addCH) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, CuaHang ch) {
        boolean addCH = repos.update(id,ch);
        if (addCH) {
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
        boolean addCH = repos.delete(id);
        if (addCH) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }
}
