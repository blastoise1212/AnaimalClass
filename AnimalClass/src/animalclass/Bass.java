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
public class Bass extends Fish implements ISwim, IMakeSound{
    String Name;
    public Bass(boolean isSaltWater, String name) {
        super(isSaltWater, name);
        Name = name;
    }

    @Override
    public void swim() {
        System.out.println("Splash splash");
    }

    @Override
    public void makeSound() {
        System.out.println("Glub glub");
    }
    
    @Override
    public String toString(){
        return Name;
    }
    
}
