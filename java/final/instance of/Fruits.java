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
public abstract class Fruits{

 /*   @Override
    public String toString() {
        return "Fruits{" + '}';
    }*/
    
}
class Apple extends Fruits implements Edible{
    @Override
    public String howtoEat()
    {
        return "Apple: Make apple cider!!";
    }
}
class Orange extends Fruits
{
   /* @Override
    public String howtoEat()
    {
        return "Orange:: Make Juice!!";
    }*/
}
