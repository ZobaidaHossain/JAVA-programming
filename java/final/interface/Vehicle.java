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
public abstract class Vehicle {
    protected String model;
    protected double weight;
    
    public Vehicle(){}
    public Vehicle(String model, double weight)
    {
        this.model=model;
        this.weight=weight;
    }
    public abstract void display();
}
