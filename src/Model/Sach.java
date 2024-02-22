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
public class Sach{
    private String maSach,tenSach,nhaXB,theLoai,doTuoi;
    private int soTrang;

    public Sach(String maSach, String tenSach, String nhaXB, String theLoai, int soTrang,String doTuoi) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXB = nhaXB;
        this.theLoai = theLoai;
        this.soTrang = soTrang;
        this.doTuoi=doTuoi;
    }
    public Sach(){
        
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) throws Exception {
        if(maSach.equals(""))
            throw new Exception("Mã sách không được để trống");
        this.maSach = maSach;
    }

    public String getDoTuoi() {
        return doTuoi;
    }

    public void setDoTuoi(String doTuoi)throws Exception {
        if(doTuoi.equals(""))
            throw new Exception("Độ tuổi không được để trống");
        this.doTuoi = doTuoi;
    }
    
    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB)throws Exception {
        if(nhaXB.equals(""))
            throw new Exception("Nhà xuất bản không được để trống");
        this.nhaXB = nhaXB;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai)throws Exception {
         if(theLoai.equals(""))
            throw new Exception("Thể loại không được để trống");
        this.theLoai = theLoai;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang)throws Exception {
        if(soTrang <0)
            throw new Exception("Số trang không được nhỏ hơn 0");
        this.soTrang = soTrang;
    }
    
}
