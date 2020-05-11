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
public class ShapeFactory {
    public Shape createShape(ShapeType shapetype){
        triangle tamgiac = triangle.CreateInstance();
        Circle tron = Circle.CreateInstance();
        Rectangle chunhat = Rectangle.CreateInstance();
        switch(shapetype){
            case triangle : return tamgiac;
            case Circle :return tron;
            case Rectangle : return chunhat;
        }
        return null;
    }
}
