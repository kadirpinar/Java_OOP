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
public abstract class Duck {
    private FlyBehaviour fb;
    private QuackBehaviour qb;
    
    public void Performfly(){
    fb.fly();
    }
    public void PerformQuack(){
    qb.qquack();
    }

      public void Swim(){
    System.out.println("All ducks can swim");
    }
    
    public abstract void Display();
    
    public void setFb(FlyBehaviour fb) {
        this.fb = fb;
    }

    public void setQb(QuackBehaviour qb) {
        this.qb = qb;
    }

    public FlyBehaviour getFb() {
        return fb;
    }

    public QuackBehaviour getQb() {
        return qb;
    }
    
    
}
