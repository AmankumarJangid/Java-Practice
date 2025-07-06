package com.Abstraction;

// each constructor needs to be call the constructor of parent so we need to call it in the constructor
// If parent has default constructor then it has no need to use parent constructor it will automatically be called.


public class Bike extends Vehicle{

    Bike(){
        super(2);
    }

    @Override
    public void makeStartSound() {
        System.out.println("Vrrrhooooo.......!");
    }
}
