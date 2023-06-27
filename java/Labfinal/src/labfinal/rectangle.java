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
public class rectangle extends shape {
   private int height,width;

    public rectangle() {
    }

    public rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public rectangle(int height, int width,float center) {
        super(center);
        this.height = height;
        this.width = width;
    }
   
    @Override
    public void draw() {
      System.out.println("area of the rectangle: "+height*width);
      
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void display(){
       System.out.println("rectangle: ");
       System.out.println("center: "+this.getCenter());
       System.out.println("width: "+this.getWidth());
       System.out.println("center: "+this.getHeight());
    }

  
}
