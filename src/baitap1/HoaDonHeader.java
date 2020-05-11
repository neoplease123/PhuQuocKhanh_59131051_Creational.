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
public class HoaDonHeader {
    int ngayban;
    String tenkhachhang,mahoadon;
    
    protected HoaDonHeader(Builder builder){
        this.mahoadon = builder.mahoadon;
        this.ngayban = builder.ngayban;
        this.tenkhachhang = builder.tenkhachhang;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "ngayban=" + ngayban + ", tenkhachhang=" + tenkhachhang + ", mahoadon=" + mahoadon + '}';
    }
    
    public static class Builder{
        int ngayban;
        String tenkhachhang,mahoadon;
        public Builder(){
        }
        public Builder addngayban(int ngayban ){
            this.ngayban = ngayban;
            return this;
        }
        public Builder addtenkhachhang(String tenkhachhang){
            this.tenkhachhang = tenkhachhang;
            return this;
        }
        public Builder addmahoadon (String mahoadon){
            this.mahoadon = mahoadon;
            return this;
        }
        public HoaDonHeader build(){
            return new HoaDonHeader(this);
        }
    }
    
}
