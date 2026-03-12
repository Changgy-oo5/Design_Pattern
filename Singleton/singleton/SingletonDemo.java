package com.example.designpatterns.singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        PrintSpooler p1 = PrintSpooler.getInstance();
        PrintSpooler p2 = PrintSpooler.getInstance();

        p1.print("singleton-test.pdf");

        System.out.println(p1 == p2); // true
    }
}
