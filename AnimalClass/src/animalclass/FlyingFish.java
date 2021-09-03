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
public class FlyingFish extends Fish implements ISwim, IFly, IMakeSound{

    public FlyingFish(boolean isSaltWater, String name) {
        super(isSaltWater, name);
    }

    @Override
    public void swim() {
        System.out.println("Splash splash");
    }

    @Override
    public void fly() {
        System.out.println("Flap flap");
    }

    @Override
    public void makeSound() {
        System.out.println("Glub glub");
    }
    
    
}
