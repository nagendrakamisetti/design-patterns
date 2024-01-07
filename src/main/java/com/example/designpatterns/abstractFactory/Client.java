package com.example.designpatterns.abstractFactory;

// Usage in client code
public class Client {
    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory(); // or SportsCarFactory or EconomyCarFactory
        Engine engine = factory.createEngine();
        Tire tire = factory.createTire();
        Interior interior = factory.createInterior();

        // Use the created car parts
        engine.start();
        tire.roll();
        interior.furnish();
    }
}
