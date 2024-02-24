/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author HP
 */
public class HoaDonXuat {
    private String maHDX, maSach, maNV, ngayXuat;
    private int soLuongX;
    private float donGiaX;
    private float thanhTien;

    public HoaDonXuat(String maHDX, String maSach, String maNV, String ngayXuat, int soLuongX, float donGiaX, float thanhTien) {
        this.maHDX = maHDX;
        this.maSach = maSach;
        this.maNV = maNV;
        this.ngayXuat = ngayXuat;
        this.soLuongX = soLuongX;
        this.donGiaX = donGiaX;
        this.thanhTien = thanhTien;
    }
    
    public HoaDonXuat() {
    }
    
     public float thanhTien() {
        return soLuongX * donGiaX;
    }

    public String getMaHDX() {
        return maHDX;
    }

    public void setMaHDX(String maHDX) throws Exception {
        if(maHDX.equals(""))
            throw new Exception("Mã hóa đơn xuất không được để trống!");
        this.maHDX = maHDX;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) throws Exception {
        if(maSach.equals(""))
            throw new Exception("Mã sách không được để trống!");
        this.maSach = maSach;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) throws Exception {
        if(maNV.equals(""))
            throw new Exception("Mã nhân viên không được để trống!");
        this.maNV = maNV;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(String ngayXuat) throws Exception {
        if(ngayXuat.equals(""))
            throw new Exception("Ngày xuất không được để trống!");
        this.ngayXuat = ngayXuat;
    }

    public int getSoLuongX() {
        return soLuongX;
    }

    public void setSoLuongX(int soLuongX) throws Exception {
        if(soLuongX <0)
            throw new Exception("Số lượng không được là số âm");
        this.soLuongX = soLuongX;
    }

    public float getDonGiaX() {
        return donGiaX;
    }

    public void setDonGiaX(float donGiaX) {
        this.donGiaX = donGiaX;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }
     
    
    
}
