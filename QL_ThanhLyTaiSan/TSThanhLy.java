/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_ThanhLy;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TSThanhLy implements Serializable{
    private String maPhieuTL;
    private String nDeNghi;
    private String donVi;
    private String maTSTL;
    private String noiDung;
    private String cbKT;
    private Date ngayGui;
    private String trangThai;
    private String yKien;
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    
    public TSThanhLy(){
        try{
        this.maPhieuTL = "";
        this.nDeNghi = "";
        this.donVi = "";
        this.maTSTL = "";
        this.noiDung = "";
        this.cbKT = "";
        this.ngayGui = format.parse("01/01/2022");
        this.trangThai = "";
        this.yKien="";
        } catch (ParseException ex) {
            Logger.getLogger(TSThanhLy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public TSThanhLy(String maPhieuTL, String nDeNghi, String donVi, String maTSTL, String noiDung, String cbKT, Date ngayGui, String trangThai) {
        this.maPhieuTL = maPhieuTL;
        this.nDeNghi = nDeNghi;
        this.donVi = donVi;
        this.maTSTL = maTSTL;
        this.noiDung = noiDung;
        this.cbKT = cbKT;
        this.ngayGui = ngayGui;
        this.trangThai = trangThai;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.maPhieuTL);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TSThanhLy other = (TSThanhLy) obj;
        return Objects.equals(this.maPhieuTL, other.maPhieuTL);
    }

    public String getMaPhieuTL() {
        return maPhieuTL;
    }

    public void setMaPhieuTL(String maPhieuTL) {
        this.maPhieuTL = maPhieuTL;
    }

    public String getnDeNghi() {
        return nDeNghi;
    }

    public void setnDeNghi(String nDeNghi) {
        this.nDeNghi = nDeNghi;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public String getMaTSTL() {
        return maTSTL;
    }

    public void setMaTSTL(String maTSTL) {
        this.maTSTL = maTSTL;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getCbKT() {
        return cbKT;
    }

    public void setCbKT(String cbKT) {
        this.cbKT = cbKT;
    }

    public String getNgayGui() {
        return format.format(ngayGui);
    }

    public void setNgayGui(Date ngayGui) {
        this.ngayGui = ngayGui;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public SimpleDateFormat getFormat() {
        return format;
    }

    public void setFormat(SimpleDateFormat format) {
        this.format = format;
    }

    public String getyKien() {
        return yKien;
    }

    public void setyKien(String yKien) {
        this.yKien = yKien;
    }

    @Override
    public String toString() {
        return  maPhieuTL;
    }

    

   
    
    
}
