package com.example.designpatterns.abstractFactory;


// Concrete Products for Sports Car (similar structure as Luxury Car)
// Concrete Products for Economy Car (similar structure as Luxury Car)

// Concrete Factories
public class LuxuryCarFactory implements CarFactory {
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    public Tire createTire() {
        return new LuxuryTire();
    }

    public Interior createInterior() {
        return new LuxuryInterior();
    }
}