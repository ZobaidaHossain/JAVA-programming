/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labfinal;

import java.awt.Point;

/**
 *
 * @author ASUS
 */
public class circle extends shape{
    private int radius;

    public circle() {
    }

    public circle(int radius) {
        this.radius = radius;
    }

    public circle(int radius, float center) {
        super(center);
        this.radius = radius;
    }

    @Override
    public void draw() {
        
      System.out.println("area of circle: "+3.1416*radius*radius);
      
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void display(){
        System.out.println("circle: ");
        System.out.println("center: "+this.getCenter());
        System.out.println("radius: "+this.getRadius());
    }

   

    
}
