package com.example.designpatterns.factory;

public abstract class CandyStore {

    public Candy orderCandy(String type) {
        Candy candy = createCandy(type);
        candy.prepare();
        return candy;
    }

    protected abstract Candy createCandy(String type);
}
