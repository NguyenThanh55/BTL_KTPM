/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.btlktpm;

/**
 *
 * @author Thanh
 */
public class Tour {
    private String maChuyen;
    private String noiDi;
    private String noiDen;
    private String ngayKhoiHanh;
    private String tgKhoiHanh;
    private double giaVe;

    public Tour(String maChuyen, String noiDi, String noiDen, String ngayKhoiHanh, String tgKhoiHanh, double giaVe) {
        this.maChuyen = maChuyen;
        this.noiDi = noiDi;
        this.noiDen = noiDen;
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.tgKhoiHanh = tgKhoiHanh;
        this.giaVe = giaVe;
    }

    public Tour() {
    }
   
    /**
     * @return the maChuyen
     */
    public String getMaChuyen() {
        return maChuyen;
    }

    /**
     * @param maChuyen the maChuyen to set
     */
    public void setMaChuyen(String maChuyen) {
        this.maChuyen = maChuyen;
    }

    /**
     * @return the noiDi
     */
    public String getNoiDi() {
        return noiDi;
    }

    /**
     * @param noiDi the noiDi to set
     */
    public void setNoiDi(String noiDi) {
        this.noiDi = noiDi;
    }

    /**
     * @return the noiDen
     */
    public String getNoiDen() {
        return noiDen;
    }

    /**
     * @param noiDen the noiDen to set
     */
    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    /**
     * @return the ngayKhoiHanh
     */
    public String getNgayKhoiHanh() {
        return ngayKhoiHanh;
    }

    /**
     * @param ngayKhoiHanh the ngayKhoiHanh to set
     */
    public void setNgayKhoiHanh(String ngayKhoiHanh) {
        this.ngayKhoiHanh = ngayKhoiHanh;
    }

    /**
     * @return the tgKhoiHanh
     */
    public String getTgKhoiHanh() {
        return tgKhoiHanh;
    }

    /**
     * @param tgKhoiHanh the tgKhoiHanh to set
     */
    public void setTgKhoiHanh(String tgKhoiHanh) {
        this.tgKhoiHanh = tgKhoiHanh;
    }

    /**
     * @return the giaVe
     */
    public double getGiaVe() {
        return giaVe;
    }

    /**
     * @param giaVe the giaVe to set
     */
    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }
    
}
