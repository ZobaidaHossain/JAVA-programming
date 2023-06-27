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
public abstract class vehicles {
    protected String model;
    protected double weight;

    public vehicles() {
    }
    

    public vehicles(String model, double weight) {
        this.model = model;
        this.weight = weight;
    }
    public abstract void display();
}
