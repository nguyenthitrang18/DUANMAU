/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DomainModel.HoaDon;
import Repository.HoaDonRepository;
import Repository.HoaDonRepositoryImpl;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoaDonServiceImpl implements HoaDonService {
    private HoaDonRepository repos = new HoaDonRepositoryImpl();

    @Override
    public List<HoaDon> getList() {
        return repos.getList();
    }

    @Override
    public String add(HoaDon hd) {
        boolean addHD = repos.add(hd);
        if (addHD) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, HoaDon hd) {
        boolean updateHD = repos.update(id,hd);
        if (updateHD) {
            return "Sửa thành công id" + id;
        }
        return "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
         boolean deleteHD = repos.delete(id);
        if (deleteHD) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
        }
}
