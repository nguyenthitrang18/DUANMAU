/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author ADMIN
 */
public class CuaHang {
    private String idch;
    private String mach;
    private String tench;
    private String diachi;
    private String thanhpho;
    private String quocgia;

    public CuaHang() {
    }

    public CuaHang(String idch, String mach, String tench, String diachi, String thanhpho, String quocgia) {
        this.idch = idch;
        this.mach = mach;
        this.tench = tench;
        this.diachi = diachi;
        this.thanhpho = thanhpho;
        this.quocgia = quocgia;
    }

    public String getIdch() {
        return idch;
    }

    public void setIdch(String idch) {
        this.idch = idch;
    }

    public String getMach() {
        return mach;
    }

    public void setMach(String mach) {
        this.mach = mach;
    }

    public String getTench() {
        return tench;
    }

    public void setTench(String tench) {
        this.tench = tench;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }
    
    
}
