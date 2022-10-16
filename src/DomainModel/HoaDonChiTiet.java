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
public class HoaDonChiTiet {
    private String idHoaDon;
    private String idChiTietSP;
    private Integer soluong;
    private Float dongia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String id, String idChiTietSP, Integer soluong, Float dongia) {
        this.idHoaDon = id;
        this.idChiTietSP = idChiTietSP;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getId() {
        return idHoaDon;
    }

    public void setId(String id) {
        this.idHoaDon = id;
    }

    public String getIdChiTietSP() {
        return idChiTietSP;
    }

    public void setIdChiTietSP(String idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public Float getDongia() {
        return dongia;
    }

    public void setDongia(Float dongia) {
        this.dongia = dongia;
    }
    
    
}
