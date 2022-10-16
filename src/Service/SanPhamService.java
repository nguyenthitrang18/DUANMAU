/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.SanPhamRepository;
import java.util.List;
import DomainModel.SanPham;

/**
 *
 * @author ADMIN
 */
public interface SanPhamService {
    
    List<SanPham> getList();

    String add(SanPham sp);

    String update(String id, SanPham sp);

    String delete(String id);
//    private SanPhamRepository repos;
//
//    public SanPhamService() {
//        repos = new SanPhamRepository();
//    }
//    
//    public List<SanPham> getSrv(){
//        return repos.getList();
//    }
//    
//    public boolean insertSP(SanPham sp) {
//        return repos.insert(sp);
//    } 
//    
//    public boolean updateSP(String id,SanPham sp) {
//        return repos.update(id,sp);
//    }
//
//    public boolean deleteSP(String id) {
//        return repos.delete(id);
//    }
}
