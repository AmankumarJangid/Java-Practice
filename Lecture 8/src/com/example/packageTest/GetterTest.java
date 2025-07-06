package com.example.packageTest;

import com.example.gettersetter.Car;
public class GetterTest {
    static Car car;
    public static void main(String[] args) {
        car = new Car(5, "Black","BMW",4000);
        System.out.printf("FuelLevel = %f\n", car.getFuelLevel());
        System.out.printf("Model = %s", car.getModel() + " "+ car.getColor());
    }
}
