package com.example.designpatterns.factory;

public class ChocolateCandy implements Candy {

    @Override
    public void prepare() {
        System.out.println("Preparing chocolate candy");
    }
}
