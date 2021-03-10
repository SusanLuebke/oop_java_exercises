package com.techreturners.cats;

public class LionCat extends CatImpl {
    private int height = 1100;
    private String roar = "Roar!!!!";

    public int getAverageHeight() {
        return height;
    }

    public String eat(){
        return roar;
    }
}

