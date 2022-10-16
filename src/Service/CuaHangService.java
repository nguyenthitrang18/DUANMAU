/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.CuaHangRepository;
import java.util.List;
import DomainModel.CuaHang;

/**
 *
 * @author ADMIN
 */
public interface CuaHangService {
//    private CuaHangRepository repos;
//
//    public CuaHangService() {
//        repos = new CuaHangRepository();
//    }
//    
//    public List<CuaHang> getSrv(){
//        return repos.getList();
//    }
//    
//    public boolean insertSrv(CuaHang ch){
//        return repos.insert(ch);
//    }
//    public boolean deleteSrv(String id){
//        return repos.delete(id);
//    }
//    public boolean updateSrv(String id,CuaHang ch){
//        return repos.update(id,ch);
//    }
    List<CuaHang> getList();
    
    String add(CuaHang ch);
    
    String update(String id, CuaHang ch);
    
    String delete(String id);
    
}
