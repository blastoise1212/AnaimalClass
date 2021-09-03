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
public class Penguin extends Bird implements ISwim, IMakeSound, IWalk{
    String Name;
    public Penguin(double wingSpan, String name) {
        super(wingSpan, name);
        Name = name;
    }

    @Override
    public void swim() {
        System.out.println("Splash splash");
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk!");
    }

    @Override
    public void walk() {
        System.out.println("Waddle waddle");
    }
    
    @Override
    public String toString() {
        return Name;
    }
    
}
