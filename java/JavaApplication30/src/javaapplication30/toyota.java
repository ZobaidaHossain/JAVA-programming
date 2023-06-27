/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;
public class toyota extends car implements drive{
    private double price;

    public toyota() {
    }

    public toyota(double price, int model, String colour) {
        super(model, colour);
        this.price = price;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getModel() {
        return model;
    }


    public void setModel(int model) {
        this.model = model;
    }

    
    public String getColour() {
        return colour;
    }


    public void setColour(String colour) {
        this.colour = colour;
    }
    
  
  
    @Override
    public void display()
    {
        System.out.println("Model: "+this.model);
        System.out.println("Colour: "+this.colour);
        System.out.println("Price: "+this.price);
        
    }
    @Override
    public void strtcar(){
        System.out.println("Start Race");
    }

    @Override
   public void stopcar(){
      System.out.println("Stop Race");
    }
    public static void main(String[] args) {
        toyota t1 = new toyota(125,3,"red");
       
        t1.display();
        t1.strtcar();
        t1.stopcar();
    }
  
}
