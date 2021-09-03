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
public class Eagle extends Bird implements IFly, IMakeSound{

    public Eagle(double wingSpan, String name) {
        super(wingSpan, name);
    }
    
    @Override
    public void fly() {
        System.out.println("Flap flap");
    }

    @Override
    public void makeSound() {
        System.out.println("Screech!");
    }
    
}
