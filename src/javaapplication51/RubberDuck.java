/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

/**
 *
 * @author Kadir
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        setFb(new NoFly());
        setQb(new Squack());
    }

    
    @Override
    public void Display() {
        System.out.println("Rubber Duck");
    }
    
}
