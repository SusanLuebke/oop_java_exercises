// By definition the blueprint for ALL cats is that they can do the following things:
//     * Eat
//     * Sleep
//     * Run

// They ALL have the following attributes
//     * A piece of data that says whether they are asleep or not 
//     * An average height represented in centimetres
//     * A piece of data that indicates their setting such as "domestic" or "wild"
//     * ALL cats go to sleep exactly the same way

// After a cat has eaten its food their reaction tends to differ between species
//     * A Lion will let out a victorious roar
//     * A cheetah will let out a snoring sound as it becomes tired following a chase
//     * A domestic cat tends to let our a purring sound

// As a bonus exercise some domestic cats will randomly let out a dismissive "It will do I suppose" comment following eating.
// We've created the Cat interface to get you started 
// ## Your solution should have...
// * The usage of a Java interface
// * The usage of a Java abstract class
// * The usage of encapsulation, abstraction, polymorphism and inheritance


package com.techreturners.cats;
//import java.awt.List;
//import java.util.ArrayList;
//import java.util.Arrays;

public abstract class CatImpl implements Cat {
    private boolean sleeping;
    private int height; // doesn't need to match int in LionCat
    private String type;

    // constructor
    public CatImpl(){
        this.sleeping = false;
    }

    @Override
    public Boolean isAsleep() {
        return this.sleeping;
    }

    @Override
    public Boolean goToSleep() {
        this.sleeping = true;
            return sleeping;
    }
    @Override
    public void wakeUp(){
        this.sleeping = false;
    }

    public String getSetting (){
        return "";
    }

    public int getAverageHeight(){
        return height;
    }

}
//
//// My stuff here
//interface Cat {
//    public void eat();
//    public void sleep();
//    public void run();
//}
//
//abstract class parentCat implements Cat{
//    Boolean asleep = true;
//    int height_cm = 24;
//    String domOrWild = "domestic, wild";
//    final ArrayList<String> setting = new
//    ArrayList<>(Arrays.asList("domestic", "wild"));
//
//    public final void sleep() {
//
//    }
//
//}
//
//class DomesticCat extends parentCat {
//
//    @Override
//    public void eat() {
//        // TODO Auto-generated method stub
//
//    }
//
//    @Override
//    public void run() {
//        // TODO Auto-generated method stub
//
//    }
//
//    public boolean isAsleep() {
//
//        return this.asleep;
//
//    }
//}
//
//
//// public void checkCatIsAwake() {
////     Cat domesticCat = new DomesticCat();
////     assertFalse("Cat should be awake by default", domesticCat.isAsleep());
//// }
