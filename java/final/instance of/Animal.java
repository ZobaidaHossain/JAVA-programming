/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_demo;

/**
 *
 * @author zakia
 */
public class Animal {
   // public abstract void display();
}
class Tiger extends Animal{
    /*@Override
    public void display(){
        System.out.println("Tiger!!!!");
    }*/
}

class Chicken extends Animal implements Edible{
    @Override
    public String howtoEat()
    {
        return "Chicken Fry!!";
    }
   /* public void display(){
        System.out.println("Chicken!!!!");
    }*/
}