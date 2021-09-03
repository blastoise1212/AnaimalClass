/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalclass;

/**
 *
 * @author mkreiner
 */
public class Ostrich extends Bird implements IWalk, IMakeSound{

    public Ostrich(double wingSpan, String name) {
        super(wingSpan, name);
    }

    @Override
    public void walk() {
        System.out.println("Step step step");
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk!");
    }
    
    
    
}
