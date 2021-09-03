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
    String Name;
    public Ostrich(double wingSpan, String name) {
        super(wingSpan, name);
        Name = name;
    }

    @Override
    public void walk() {
        System.out.println("Step step step");
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk!");
    }
    
    @Override
    public String toString() {
        return Name;
    }
    
    
    
}
