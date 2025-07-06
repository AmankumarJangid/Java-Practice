package com.Inheritence;

public class Vehicle {

    private int numberOfWheels;
    protected String model ;
    protected String color;
    private boolean start;
    private boolean stop;
    {
        start = false;
        stop = true;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public void commute(){
        System.out.printf("Number of wheels used to go from A to B are %d\n", numberOfWheels);
    }

    public void start(){
        if( !start){
            start = true;
            stop = false;
            System.out.println("The car is starting");
        }
        else{
            System.out.println("The car has already started");
        }
    }

    public void stop(){
        if( !stop ){
            stop = true;
            start = false;
            System.out.println("Car has been stopped");
        }
        else{
            System.out.println("Car is already stopped");
        }
    }


}
