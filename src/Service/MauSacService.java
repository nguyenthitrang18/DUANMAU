/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.MauSacRepository;
import java.util.List;
import DomainModel.MauSac;

/**
 *
 * @author ADMIN
 */
public interface MauSacService {
    
    List<MauSac> getList();

    String add(MauSac ms);

    String update(String id, MauSac ms);

    String deleteSrv(String id);
//    private MauSacRepository repos;
//
//    public MauSacService() {
//        repos = new MauSacRepository();
//    }
//    
//    public List<MauSac> getSrv(){
//        return repos.getList();
//    }
//    
//    public boolean insertSrv(MauSac ms){
//        return repos.insert(ms);
//    }
//    public boolean deleteSrv(String id){
//        return repos.delete(id);
//    }
//    public boolean updateSrv(String id,MauSac ms){
//        return repos.update(id,ms);
//    }
}
