package com.example.designpatterns.factoryMethod;

public class Bike implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing a bike.");
    }
}
