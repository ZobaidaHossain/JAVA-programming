/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;



public abstract class car{
int model;
String colour;

    public car() {
    }

    public car(int model, String colour) {
        this.model = model;
        this.colour = colour;
    }

abstract void display();
}
 

