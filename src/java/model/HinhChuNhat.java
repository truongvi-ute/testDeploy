/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class HinhChuNhat {
    private float chieudai;
    private float chieurong;

    public HinhChuNhat()
    {
        chieudai = 0;
        chieurong = 0;
    }
    public HinhChuNhat(float dai, float rong){
        chieudai = dai;
        chieurong = rong;
    }
    public float tinhChuVi(){
        return (chieudai+chieurong)*2;
    }
    public float tinhDienTich(){
        return chieudai*chieurong;
    }
    public float getChieuDai(){
        return chieudai;
    }
    public void setChieuDai(float dai){
        chieudai = dai;
    }
    public float getChieuRong(){
        return chieurong;
    }
    public void setChieuRong(float rong){
        chieurong = rong;
    }
}
