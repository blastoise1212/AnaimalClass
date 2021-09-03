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
public abstract class Fish extends Animal implements ISwim{
    private boolean isSaltWater;

    public Fish(boolean isSaltWater, String name) {
        super(name);
        this.isSaltWater = isSaltWater;
    }

    public boolean isIsSaltWater() {
        return isSaltWater;
    }

    public void setIsSaltWater(boolean isSaltWater) {
        this.isSaltWater = isSaltWater;
    }
    
    
}
