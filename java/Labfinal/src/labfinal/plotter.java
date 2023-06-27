/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labfinal;

/**
 *
 * @author ASUS
 */
public class plotter implements drawable{

    @Override
    public void draw() {
    }
   public static void main(String[]args){
       point p1=new point(10,12);
       point p2=new point(12,14);
       System.out.println("x: "+p1.getX());
       System.out.println("Y: "+p1.getY());
       shape c1=new circle(12, (float) 0.0);
      
       c1.setCenter();
       c1.draw();
       //c1.display();
       
       shape r1=new rectangle(10,11,(float) 0.0);
       r1.setCenter();
       r1.draw();
       //r1.display();
       line L1=new line();
       L1.draw();
       //if(L1 instanceof drawable){
          /// System.out.println(((drawable)L1).draw());
      // }
   } 
}
