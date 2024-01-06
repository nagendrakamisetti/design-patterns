package com.example.designpatterns.factoryMethod;

public class Client {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.manufacture(); // Output: Manufacturing a car.

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.manufacture(); // Output: Manufacturing a bike.
    }
}

