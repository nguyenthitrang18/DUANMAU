/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.DongSPRepository;
import java.util.List;
import DomainModel.DongSP;

/**
 *
 * @author ADMIN
 */
public interface DongSPService {
    
    List<DongSP> getList();

    String add(DongSP dsp);

    String update(String id, DongSP dsp);

    String deleteSrv(String id);
    
    
//    private DongSPRepository repos;
//
//    public  DongSPService() {
//        repos = new DongSPRepository();
//    }
//    
//    public List<DongSP> getSrv(){
//        return repos.getList();
//    }
//    
//    public boolean insertSrv(DongSP dongsp){
//        return repos.insert(dongsp);
//    }
//    public boolean deleteSrv(String id){
//        return repos.delete(id);
//    }
//    public boolean updateSrv(String id,DongSP dongsp){
//        return repos.update(id,dongsp);
//    }
}
