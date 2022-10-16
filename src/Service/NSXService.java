/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.NSXRepository;
import java.util.List;
import DomainModel.NSX;

/**
 *
 * @author ADMIN
 */
public interface NSXService {
    
    List<NSX> getList();

    String add(NSX nsx);

    String update(String id, NSX nsx);

    String deleteSrv(String id);
//    private NSXRepository repos;
//
//    public NSXService() {
//        repos = new NSXRepository();
//    }
//    
//    public List<NSX> getSrv(){
//        return repos.getList();
//    }
//    public boolean insertSrv(NSX nsx){
//        return repos.insert(nsx);
//    }
//    public boolean deleteSrv(String id){
//        return repos.delete(id);
//    }
//    public boolean updateSrv(String id,NSX nsx){
//        return repos.update(id,nsx);
//    }
}
