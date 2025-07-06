package com.Abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
//      Vehicle car = new Vehicle(2); // can't be instantiated like this

        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        car.commute();

        bike.start();
        bike.commute();

    }
}
