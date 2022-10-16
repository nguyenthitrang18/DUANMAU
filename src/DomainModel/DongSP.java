/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author ADMIN
 */
public class DongSP {
    private String idDG;
    private String maDG;
    private String tenDG;

    public DongSP() {
    }

    public DongSP(String idDG, String maDG, String tenDG) {
        this.idDG = idDG;
        this.maDG = maDG;
        this.tenDG = tenDG;
    }

    public String getIdDG() {
        return idDG;
    }

    public void setIdDG(String idDG) {
        this.idDG = idDG;
    }

    public String getMaDG() {
        return maDG;
    }

    public void setMaDG(String maDG) {
        this.maDG = maDG;
    }

    public String getTenDG() {
        return tenDG;
    }

    public void setTenDG(String tenDG) {
        this.tenDG = tenDG;
    }
    
    
}
