package com.example.designpatterns.factory;

public class LocalCandyStore extends CandyStore {

    @Override
    protected Candy createCandy(String type) {

        if (type.equalsIgnoreCase("chocolate")) {
            return new ChocolateCandy();
        }
        if (type.equalsIgnoreCase("gummy")) {
            return new GummyCandy();
        }
        return null;
    }
}
