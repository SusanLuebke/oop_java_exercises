package com.techreturners.cats;


import com.sun.org.apache.xpath.internal.operations.Bool;

public class DomesticCat extends CatImpl {

    // Constructor
    public DomesticCat () {
        super("Purrrrrr");
    }

    private String type = "domestic";

    private int averageHeight = 23;

    public String getSetting(){
        return type;
    }

    public int getAverageHeight() {
        return averageHeight;
    }

//    @Override
//    public String eat() {
//        return "Purrrrrr";
//    }

}
