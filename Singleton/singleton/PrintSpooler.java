package com.example.designpatterns.singleton;

public class PrintSpooler {

    private static PrintSpooler instance;

    // Private constructor
    private PrintSpooler() {
        init();
    }

    // Initialization method
    private void init() {
        System.out.println("Initializing Print Spooler...");
    }

    // Synchronized for multithread
    public static synchronized PrintSpooler getInstance() {
        if (instance == null) {
            instance = new PrintSpooler();
        }
        return instance;
    }

    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}
