/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

import java.math.BigDecimal;

/**
 *
 * @author ADMIN
 */
public class ChiTietSanPham {
    private String id;
    private String idSP;
    private String idNSX;
    private String idMausac;
    private String idDongiasp;
    private Integer NamBH;
    private String mota;
    private Integer soluongton;
    private Float gianhap;
    private Float giaban;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(String id, String idSP, String idNSX, String idMausac, String idDongiasp, Integer NamBH, String mota, Integer soluongton, Float gianhap, Float giaban) {
        this.id = id;
        this.idSP = idSP;
        this.idNSX = idNSX;
        this.idMausac = idMausac;
        this.idDongiasp = idDongiasp;
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

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getIdNSX() {
        return idNSX;
    }

    public void setIdNSX(String idNSX) {
        this.idNSX = idNSX;
    }

    public String getIdMausac() {
        return idMausac;
    }

    public void setIdMausac(String idMausac) {
        this.idMausac = idMausac;
    }

    public String getIdDongiasp() {
        return idDongiasp;
    }

    public void setIdDongiasp(String idDongiasp) {
        this.idDongiasp = idDongiasp;
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
