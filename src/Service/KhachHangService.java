/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.KhachHangRepository;
import java.util.List;
import DomainModel.KhachHang;

/**
 *
 * @author ADMIN
 */
public interface KhachHangService {
    
    List<KhachHang> getList();

    String add(KhachHang kh);

    String update(String id, KhachHang kh);

    String delete(String id);
//    private KhachHangRepository repos;
//
//    public KhachHangService() {
//        repos = new KhachHangRepository();
//    }
//    
//    public List<KhachHang> getSrv(){
//        return repos.getList();
//    }
//    
//    public boolean insertSrv(KhachHang kh){
//        return repos.insert(kh);
//    }
//    public boolean deleteSrv(String id){
//        return repos.delete(id);
//    }
////    public boolean updateSrv(String id,CuaHang ch){
////        return repos.update(id,ch);
////    }
//    
    
}
