/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_Ex;

/**
 *
 * @author zakia
 */
public class Honda extends Vehicle implements Drive, Race{
    private int noWheel;
    private double price;
    public Honda() {
    }

    public Honda(String model, double weight, int nW, double price) {
        super(model, weight);
        this.noWheel=nW;
        this.price=price;
    }

    public int getNoWheel() {
        return noWheel;
    }

    public void setNoWheel(int noWheel) {
        this.noWheel = noWheel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void display()
    {
        System.out.println("Model: "+this.model);
        System.out.println("Weight: "+this.weight);
        System.out.println("Price: "+this.price);
        System.out.println("Number of Wheel: "+this.noWheel);
    }
    @Override
    public void startRace(){
        System.out.println("Start Race");
    }
    @Override
    public void stopRace(){
      System.out.println("Stop Race");
    }
    @Override
    public void turn(){
          System.out.println("Turn Right");
    }
    @Override
    public void drive(){
      System.out.println("Go Straight!!");
    }
    @Override
    public void stop()
    {
      System.out.println("Stop Please!!");
    }
   
    public static void main(String args[])
    {
        Honda h1=new Honda("Hero",125,2,170000);
       
        h1.display();
        h1.drive();
        h1.turn();
        h1.startRace();
        h1.stopRace();
        
        Vehicle v=new Honda();
        Race d=new Honda();
        
        
        d.startRace();
        
    }
}
