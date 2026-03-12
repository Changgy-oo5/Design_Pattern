package com.example.designpatterns.factory;

public class GummyCandy implements Candy {

    @Override
    public void prepare() {
        System.out.println("Preparing gummy candy");
    }
}
