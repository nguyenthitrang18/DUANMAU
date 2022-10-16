/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DomainModel.KhachHang;
import Repository.KhachHangRepository;
import Repository.KhachHangRepositoryImpl;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class KhachHangServiceImpl implements KhachHangService{
    private KhachHangRepository repos = new KhachHangRepositoryImpl();

    @Override
    public List<KhachHang> getList() {
        return repos.getList();
    }

    @Override
    public String add(KhachHang kh) {
        boolean addKH = repos.add(kh);
        if (addKH) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, KhachHang kh) {
        boolean updateKH = repos.update(id,kh);
        if (updateKH) {
            return "Sửa thành công id" + id;
        }
        return "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
        boolean deleteKH = repos.delete(id);
        if (deleteKH) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }
}
