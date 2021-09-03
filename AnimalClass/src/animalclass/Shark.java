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
public class Shark extends Fish implements ISwim, IMakeSound{

    public Shark(boolean isSaltWater, String name) {
        super(isSaltWater, name);
    }

    @Override
    public void swim() {
        System.out.println("Splash splash");
    }

    @Override
    public void makeSound() {
        System.out.println("Om nom nom");
    }
    
    
}
