/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DomainModel.NSX;
import Repository.NSXRepositoryImpl;
import Repository.NSXRepository;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NSXServiceImpl implements NSXService {

    private NSXRepository repos = new NSXRepositoryImpl();

    @Override
    public List<NSX> getList() {
        return repos.getList();
    }

    @Override
    public String add(NSX nsx) {
        boolean addNSX = repos.add(nsx);
        if (addNSX) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, NSX nsx) {
        boolean updateNSX = repos.update(id, nsx);
        if (updateNSX) {
            return "Sửa thành công id" + id;
        }
        return "Sửa thất bại";
    }

    @Override
    public String deleteSrv(String id) {
        boolean deleteNSX = repos.delete(id);
        if (deleteNSX) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

}
