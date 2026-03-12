package com.example.designpatterns.factory;

public class FactoryDemo {

    public static void main(String[] args) {

        CandyStore store = new LocalCandyStore();

        store.orderCandy("chocolate");
        store.orderCandy("gummy");
    }
}
