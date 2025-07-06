package com.example.gettersetter;

 public class Car {
    private double fuelLevel;
    private String color;
    private String model;
    private long costOfFuel;

     public Car(double fuelLevel, String color, String model, long costOfFuel) {
         this.fuelLevel = fuelLevel;
         this.color = color;
         this.model = model;
         this.costOfFuel = costOfFuel;
     }

     public double getFuelLevel() {
         return fuelLevel;
     }

     public void setFuelLevel(double fuelLevel) {
         this.fuelLevel = fuelLevel;
     }

     public String getColor() {
         return color;
     }

     void setColor(String color) { //  only access in own package
         this.color = color;
     }

     public String getModel() {
         return model;
     }

     void setModel(String model) {
         this.model = model;
     }

     public long getCostOfFuel() {
         return costOfFuel;
     }

     public void setCostOfFuel(long costOfFuel) {
         this.costOfFuel = costOfFuel;
     }
 }
