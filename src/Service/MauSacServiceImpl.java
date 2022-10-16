/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DomainModel.MauSac;
import Repository.MauSacRepositoryImpl;
import Repository.MauSacRepository;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class MauSacServiceImpl implements MauSacService{

    private MauSacRepository repos = new MauSacRepositoryImpl();
    
    @Override
    public List<MauSac> getList() {
        return repos.getList();
    }

    @Override
    public String add(MauSac ms) {
        boolean addMS = repos.add(ms);
        if (addMS) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, MauSac ms) {
        boolean addMS = repos.update(id,ms);
        if (addMS) {
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }

    @Override
    public String deleteSrv(String id) {
        boolean deleteCV = repos.delete(id);
        if (deleteCV) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }
    
}
