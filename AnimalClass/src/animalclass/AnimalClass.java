/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalclass;

import java.util.ArrayList;

/**
 *
 * @author mkreiner
 */
public class AnimalClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String eachName = "";
        double wSpan;
        double bodyTemp;
        boolean isWaterSalty;
        Bass lMouth = new Bass(false, "Bass");
        Shark blackTip = new Shark(true, "Shark");
        FlyingFish fishFly = new FlyingFish(true, "FF1");
        
        Lion asiaticLion = new Lion(100.5, "Lion");
        Dolphin amazonRiverDolphin = new Dolphin(96.9, "Dolphin");
        Bat giantFruitBat = new Bat(98.6, "Bat");
        
        Eagle goldenEagle = new Eagle(6, "Eagle");
        Penguin emperorPenguin = new Penguin(2.5, "Penguin");
        Ostrich somaliOstrich = new Ostrich(6.5, "Ostrich");
        
        
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(lMouth);
        animalList.add(blackTip);
        animalList.add(fishFly);
        animalList.add(asiaticLion);
        animalList.add(amazonRiverDolphin);
        animalList.add(giantFruitBat);
        animalList.add(goldenEagle);
        animalList.add(emperorPenguin);
        animalList.add(somaliOstrich);
        
        ArrayList<Bird> birdList = new ArrayList<>();
        birdList.add(goldenEagle);
        birdList.add(emperorPenguin);
        birdList.add(somaliOstrich);
        
        ArrayList<Fish> fishList = new ArrayList<>();
        fishList.add(lMouth);
        fishList.add(blackTip);
        fishList.add(fishFly);
        
        ArrayList<Mammal> mammalList = new ArrayList<>();
        mammalList.add(asiaticLion);
        mammalList.add(amazonRiverDolphin);
        mammalList.add(giantFruitBat);
        
        ArrayList<ISwim> swimList = new ArrayList<>();
        swimList.add(lMouth);
        swimList.add(amazonRiverDolphin);
        swimList.add(emperorPenguin);
        swimList.add(blackTip);
        swimList.add(fishFly);
        
        ArrayList<IFly> flyList = new ArrayList<>();
        flyList.add(fishFly);
        flyList.add(goldenEagle);
        flyList.add(giantFruitBat);
        
        ArrayList<IWalk> walkList = new ArrayList<>();
        walkList.add(asiaticLion);
        walkList.add(emperorPenguin);
        walkList.add(somaliOstrich);
        
        ArrayList<IMakeSound> soundList = new ArrayList<>();
        soundList.add(lMouth);
        soundList.add(blackTip);
        soundList.add(fishFly);
        soundList.add(asiaticLion);
        soundList.add(amazonRiverDolphin);
        soundList.add(giantFruitBat);
        soundList.add(goldenEagle);
        soundList.add(emperorPenguin);
        soundList.add(somaliOstrich);
        //All animals list
        for (Animal animal : animalList)
        {
            eachName = animal.getName();
            System.out.println(eachName);
        }
        //bird list
        for (Bird bird : birdList)
        {
            wSpan = bird.getWingSpan();
            System.out.println(wSpan);
        }
        //fish list
        for (Fish fish : fishList)
        {
            isWaterSalty = fish.isIsSaltWater();
            System.out.println(isWaterSalty);
        }
        //mammal list
        for (Mammal mammal : mammalList)
        {
            bodyTemp = mammal.getBodyTemp();
            System.out.println(bodyTemp);
        }
        
        for (ISwim Swim : swimList)
        {
           Swim.swim();
        }
        
        for (IFly Fly : flyList)
        {
           Fly.fly();
        }
        
        for (IWalk Walk : walkList)
        {
           Walk.walk();
        }
        
        for (IMakeSound Sound : soundList)
        {
           Sound.makeSound();
        }
        
        
        
        System.out.println(lMouth.toString());
        
    }
    
}
