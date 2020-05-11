/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author Admin
 */
public class baitap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder stringbuild = new MyStringBuilder.Builder()
                .addString("khanh \n")
                .addString("diem: ")
                .addFloat(10)
                .addString("  dung khong: ")
                .addBool(true)
                .build();
        System.out.println(stringbuild.toString());
    }
    
}
