package com.Abstraction;

public class Car extends Vehicle{

    public Car(){
        super(4);
    }

    @Override
    public void makeStartSound() { // its a contract that always needed to be fullfilled by child or else we can also make child class to be abstract to other
        System.out.println("BBhrooooo......!");
    }
}
