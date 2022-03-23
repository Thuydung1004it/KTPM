/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.htbanve.pojo;
import javafx.scene.control.TextField;
/**
 *
 * @author Tuan Anh
 */
public class PrintTicket {
    private String id;
    private String tencx;
    private String bsx;
    private String ngaykh;
    private String giokh;
    private String ghe;
    private String gia;
    private String tenkh;
    private String sdt;
    private String tennv;

    
    public PrintTicket(String id, String tencx, String bsx, String ngaykh, String giokh, 
            String gia, String ghe, String tenkh, String sdt, String tennv) {
        this.id = id;
        this.tencx = tencx;
        this.bsx = bsx;
        this.ngaykh = ngaykh;
        this.giokh = giokh;
        this.ghe = ghe;
        this.gia = gia;
        this.tenkh = tenkh;
        this.sdt = sdt;
        this.tennv = tennv;
    }
    


    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the tencx
     */
    public String getTencx() {
        return tencx;
    }

    /**
     * @param tencx the tencx to set
     */
    public void setTencx(String tencx) {
        this.tencx = tencx;
    }

    /**
     * @return the bsx
     */
    public String getBsx() {
        return bsx;
    }

    /**
     * @param bsx the bsx to set
     */
    public void setBsx(String bsx) {
        this.bsx = bsx;
    }

    /**
     * @return the ngaykh
     */
    public String getNgaykh() {
        return ngaykh;
    }

    /**
     * @param ngaykh the ngaykh to set
     */
    public void setNgaykh(String ngaykh) {
        this.ngaykh = ngaykh;
    }

    /**
     * @return the giokh
     */
    public String getGiokh() {
        return giokh;
    }

    /**
     * @param giokh the giokh to set
     */
    public void setGiokh(String giokh) {
        this.giokh = giokh;
    }

    /**
     * @return the ghe
     */
    public String getGhe() {
        return ghe;
    }

    /**
     * @param ghe the ghe to set
     */
    public void setGhe(String ghe) {
        this.ghe = ghe;
    }

    /**
     * @return the gia
     */
    public String getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(String gia) {
        this.gia = gia;
    }

    /**
     * @return the tenkh
     */
    public String getTenkh() {
        return tenkh;
    }

    /**
     * @param tenkh the tenkh to set
     */
    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    /**
     * @return the sdt
     */
    public String getSdt() {
        return sdt;
    }

    /**
     * @param sdt the sdt to set
     */
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    /**
     * @return the tennv
     */
    public String getTennv() {
        return tennv;
    }

    /**
     * @param tennv the tennv to set
     */
    public void setTennv(String tennv) {
        this.tennv = tennv;
    }
}
