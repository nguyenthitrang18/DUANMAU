/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DomainModel.DongSP;
import Repository.DongSPRepositoryImpl;
import Repository.DongSPRepository;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class DongSPServiceImpl implements DongSPService{

    private DongSPRepository repos = new DongSPRepositoryImpl();
    
    @Override
    public List<DongSP> getList() {
        return repos.getList();
    }

    @Override
    public String add(DongSP dsp) {
        boolean addDSP = repos.add(dsp);
        if (addDSP) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, DongSP dsp) {
        boolean updateDSP = repos.update(id,dsp);
        if (updateDSP) {
            return "Sửa thành công id" + id;
        }
        return "Sửa thất bại";
    }

    @Override
    public String deleteSrv(String id) {
        boolean deleteDSP = repos.delete(id);
        if (deleteDSP) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }
    
}
