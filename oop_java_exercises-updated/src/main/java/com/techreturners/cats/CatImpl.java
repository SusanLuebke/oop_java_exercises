package com.techreturners.cats;

public abstract class CatImpl implements Cat {
    private boolean sleeping;
    private int height;
    private String eatingNoise;
    private String setting;
    public CatImpl(String eatingNoise, int height, String setting){
        this.eatingNoise = eatingNoise;
        this.height = height;
        this.setting = setting;
    }
    public Boolean isAsleep() {
        return this.sleeping;
    }
    public Boolean goToSleep() {
        this.sleeping = true;
        return sleeping;
    }
    public void wakeUp(){
        this.sleeping = false;
    }
    public String getSetting (){
        return setting;
    }
    public int getAverageHeight(){
        return height;
    }
    public String eat() {
        return eatingNoise;
    }
}


// My Original
//package com.techreturners.cats;
//
//public abstract class CatImpl implements Cat { // implements cat interface
//    private boolean sleeping;
//    private int height; // doesn't need to match int in LionCat
//    private String type;
//    private String eatingNoise;
//
//    // constructor
//    public CatImpl( String eatingNoise ) {
//        this.eatingNoise = eatingNoise;
//        this.sleeping = false;
//    }
//
//    @Override
//    public Boolean isAsleep() {
//        return this.sleeping;
//    }
//
//    @Override
//    public Boolean goToSleep() {
//        this.sleeping = true;
//            return sleeping;
//    }
//    @Override
//    public void wakeUp(){
//        this.sleeping = false;
//    }
//
//    public String getSetting (){
//        return "";
//    }
//
//    public int getAverageHeight(){
//        return height;
//    }
//
//    public String eat() {
//        return eatingNoise;
//    }
//
//}
