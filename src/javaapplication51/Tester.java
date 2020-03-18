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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Duck duck1 = new MallardDuck();
        Duck duck2 = new RubberDuck();
        Duck duck3 = new DecoyDuck();
        
        duck1.Display();
        duck1.Performfly();
        duck1.PerformQuack();
        duck1.Swim();
        
        duck2.Display();
        duck2.PerformQuack();
        duck2.Performfly();
        duck2.Swim();
        
        duck3.Display();
        duck3.PerformQuack();
        duck3.Performfly();
        duck3.Swim();
    }
    
}
