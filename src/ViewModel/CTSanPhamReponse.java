/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author ADMIN
 */
public class CTSanPhamReponse {
    private String id;
    private String tenSp;
    private String tenNSX;
    private String tenMausac;
    private String tenDongiasp;
    private Integer NamBH;
    private String mota;
    private Integer soluongton;
    private Float gianhap;
    private Float giaban;

    public CTSanPhamReponse() {
    }

    public CTSanPhamReponse(String id, String tenSp, String tenNSX, String tenMausac, String tenDongiasp, Integer NamBH, String mota, Integer soluongton, Float gianhap, Float giaban) {
        this.id = id;
        this.tenSp = tenSp;
        this.tenNSX = tenNSX;
        this.tenMausac = tenMausac;
        this.tenDongiasp = tenDongiasp;
        this.NamBH = NamBH;
        this.mota = mota;
        this.soluongton = soluongton;
        this.gianhap = gianhap;
        this.giaban = giaban;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getTenMausac() {
        return tenMausac;
    }

    public void setTenMausac(String tenMausac) {
        this.tenMausac = tenMausac;
    }

    public String getTenDongiasp() {
        return tenDongiasp;
    }

    public void setTenDongiasp(String tenDongiasp) {
        this.tenDongiasp = tenDongiasp;
    }

    public Integer getNamBH() {
        return NamBH;
    }

    public void setNamBH(Integer NamBH) {
        this.NamBH = NamBH;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Integer getSoluongton() {
        return soluongton;
    }

    public void setSoluongton(Integer soluongton) {
        this.soluongton = soluongton;
    }

    public Float getGianhap() {
        return gianhap;
    }

    public void setGianhap(Float gianhap) {
        this.gianhap = gianhap;
    }

    public Float getGiaban() {
        return giaban;
    }

    public void setGiaban(Float giaban) {
        this.giaban = giaban;
    }
    
    
}
