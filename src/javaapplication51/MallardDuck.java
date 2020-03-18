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
public class MallardDuck extends Duck{

    public MallardDuck() {
        setFb(new FlyWithWings());
        setQb(new Quack());
    }

    
    
    @Override
    public void Display() {
        System.out.println("Mallard Duck");
    }
    
}
