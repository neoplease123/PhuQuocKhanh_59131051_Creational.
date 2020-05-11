/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Admin
 */
public class CTHD {
    String sanPham;
    int soLuong,donGia;
    float chietKhau;

    protected CTHD (Builder builder){
        this.sanPham = builder.sanPham;
        this.soLuong = builder.soLuong;
        this.donGia = builder.donGia;
        this.chietKhau = builder.chietKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" + "sanPham=" + sanPham + ", soLuong=" + soLuong + ", donGia=" + donGia + ", chietKhau=" + chietKhau + '}';
    }
    
    public static class Builder{
        String sanPham;
        int soLuong,donGia;
        float chietKhau;
        public Builder(){
        }
        public Builder addsanpham(String sanPham){
            this.sanPham = sanPham;
            return this;
        }
        public Builder addsoLuong(int soLuong){
            this.soLuong = soLuong;
            return this;
        }
        public Builder adddonGia(int donGia){
            this.donGia = donGia;
            return this;
        }
        public Builder addchietKhau(float chietKhau){
            this.chietKhau = chietKhau;
            return this;
        }
        public CTHD build(){
            return new CTHD(this);
        }
    }
}
