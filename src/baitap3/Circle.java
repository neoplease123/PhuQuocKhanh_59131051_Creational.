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
public class Circle extends Shape {
    //hinh tron
    private static Circle instance;
    public static Circle CreateInstance(){
        if(instance == null) 
            return new Circle();
        return instance;
    }

    @Override
    public String draw() {
        return brush +" ve hinh tron " + paper +" giay A4 " + frame +" cat thanh hinh tron ";
    }
    
}
