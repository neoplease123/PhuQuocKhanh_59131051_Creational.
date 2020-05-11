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
public class baitap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory s = new ShapeFactory();
        System.out.println(s.createShape(ShapeType.Circle).draw());
        System.out.println(s.createShape(ShapeType.Rectangle).draw());
        System.out.println(s.createShape(ShapeType.triangle).draw());
    }
    
}
