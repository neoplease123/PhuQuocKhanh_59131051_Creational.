/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author Admin
 */
public class triangle extends Shape{
    // hinh tam giac
    private static triangle instance;
    public static triangle CreateInstance()
    {
        if( instance == null) 
            return new triangle();
        return instance;
        
    }
    @Override
    public String draw() {
        return brush +" ve hinh tam giac " + paper +" giay A4 " + frame +" cat thanh hinh tam giac ";
    }
    
}
