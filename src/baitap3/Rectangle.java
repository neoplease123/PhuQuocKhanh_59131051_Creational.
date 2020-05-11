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
public class Rectangle extends Shape {
    // hinh chu nhat
    private static Rectangle instance;
    public static Rectangle CreateInstance(){
        if(instance == null )
            return new Rectangle();
        return instance;
    }

    @Override
    public String draw() {
        return brush +" ve hinh hinh chu nhat " + paper +" giay A4 " + frame +" cat thanh hinh chu nhat ";
    }
    
}
