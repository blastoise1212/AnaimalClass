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
public class Lion extends Mammal implements IWalk, IMakeSound{
    String Name;
    public Lion(double bodyTemp, String name) {
        super(bodyTemp, name);
        Name = name;
    }

    @Override
    public void walk() {
        System.out.println("Pad pad");
    }

    @Override
    public void makeSound() {
        System.out.println("Roaaar!");
    }
    
    @Override
    public String toString() {
        return Name;
    }
    
}
