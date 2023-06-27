/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_test_me;

/**
 *
 * @author ASUS
 */
public class honda extends vehicles implements drive, race{
    private int nowheel;
    private double price;

    public honda() {
    }

   

    public honda(int nowheel, double price, String model, double weight) {
        super(model, weight);
        this.nowheel = nowheel;
        this.price = price;
    }

    public int getNowheel() {
        return nowheel;
    }

    public void setNowheel(int nowheel) {
        this.nowheel = nowheel;
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
    public void display() {
     System.out.println("model: "+this.model);
     System.out.println("weight: "+this.weight);
     System.out.println("price: "+this.price);
     System.out.println("wheel: "+this.nowheel);
    }

    @Override
    public void drive() {
           System.out.println("go straight");
    }

    @Override
    public void stop() {
        System.out.println("stop race");
    }

    @Override
    public void turn() {
      System.out.println("turn right");
    }

    @Override
    public void startrace() {
       System.out.println("start please");
    }

    @Override
    public void stoprace() {
      System.out.println("stop please");
    }
    public static void main(String args[]){
        honda h1=new honda(2,17000,"hero",125);
        h1.display();
        h1.drive();
        h1.turn();
        vehicles v=new honda();
        race d= new honda();
        d.startrace();
        d.stoprace();
        honda v1=new honda();
        drive d1= new honda();
        d1.turn();
        
    }
    
}
