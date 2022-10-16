/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DomainModel.ChucVu;
import Repository.ChucVuRepository;
import Repository.ChucVuRepositpryImpl;
import Service.ChucVuService;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ChucVuServiceImpl implements ChucVuService{
    private ChucVuRepository repos = new ChucVuRepositpryImpl();

    @Override
    public List<ChucVu> getList() {
        return repos.getList();
    }

    @Override
    public String add(ChucVu cv) {
        boolean addCV = repos.add(cv);
        if (addCV) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, ChucVu chucVu) {
        boolean updateCV = repos.update(id,chucVu);
        if (updateCV) {
            return "Sửa thành công id" + id;
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
