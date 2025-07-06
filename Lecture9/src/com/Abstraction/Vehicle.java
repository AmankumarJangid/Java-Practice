package com.Abstraction;

// to send or share responsibility of parent class of defining any function to child 
// we also make it abstract and then its child class's responsibility to make or define that funciton
// in this way we no need to define the function at parent end but needed to defined at child end

import com.Interface.Transport;

public abstract class Vehicle implements Transport {

    private int noOfTires;

    @Override
    public void getSetGo(){
        System.out.println("We are set to go!");
    }
    protected Vehicle( int noOfTires){
        this.noOfTires = noOfTires;
    }
    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute(){
        System.out.printf("Going on %d tires\n", noOfTires);
    }

    public void start(){
        this.makeStartSound();
        System.out.printf("%s is starting\n ", this.getClass().getSimpleName());
    }
    
    public abstract void makeStartSound();

}
