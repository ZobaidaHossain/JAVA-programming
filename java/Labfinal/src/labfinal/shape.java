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
public abstract class shape implements drawable{
    private float center;

    public shape() {
    }

    public shape(float center) {
        this.center = center;
    }
    
    public float getCenter() {
        return center;
    }

    public void setCenter(float center) {
        this.center = center;
    }
  // public void display(){
       
      // System.out.println("center: "+this.getCenter());
       
   // } 

  void setCenter() {
     System.out.println("center: "+this.getCenter());
    }

}
