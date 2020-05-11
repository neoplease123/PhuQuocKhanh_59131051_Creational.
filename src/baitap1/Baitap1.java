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
public class Baitap1 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon hoadon = new HoaDon();
        hoadon.hoadonHeader = new HoaDonHeader.Builder()
                    .addmahoadon("AE485")
                    .addngayban(02072020)
                    .addtenkhachhang("phuquockhanh")
                    .build();
        CTHD sp1 = new CTHD.Builder()
                    .addsanpham("Sach")
                    .adddonGia(10000)
                    .addsoLuong(5)
                    .addchietKhau((float) 0.01)
                    .build();
        CTHD sp2 = new CTHD.Builder()
                    .addsanpham("vo")
                    .adddonGia(5000)
                    .addsoLuong(15)
                    .addchietKhau((float) 0.1)
                    .build();
        hoadon.dsCTHD.add(sp1);
        hoadon.dsCTHD.add(sp2);
        System.out.println(hoadon.hoadonHeader.toString());
        for(int i = 0 ; i < hoadon.dsCTHD.size(); i++)
        {
            System.out.println("San Pham Thu " +(i+1)+" la:\n"+hoadon.dsCTHD.get(i).toString());
        }
                 
        
                    
                    
                
                
                
    }
    
}
