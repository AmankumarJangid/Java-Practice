package com.example.geometry;

import java.lang.Math;
public class Circle {
    // this run on every instance when object is created
    {
        System.out.println("this is the circle object");
    }

    static{ //runs only first time when object gets into memory
        System.out.println("Circle is loaded in the static block");
    }
    private double radius;

    public Circle setRadius( double radius){
        try{
            if( radius <= 0){
                throw new IllegalArgumentException(String.format( " At Object %s : length and width should be an positive and non zero ", this.getClass().getName()));
            }
            this.radius = radius;
        }

        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        return this;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getParameter(){
        return Math.PI * radius * 2;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(12);

        System.out.println(c1.getArea());
        System.out.println(c1.getParameter());

        c1.setRadius(5);
        System.out.println(c1.getArea());
        System.out.println(c1.getParameter());

        System.out.println(new Circle().setRadius(5/Math.PI).getArea());
        System.out.println(new Circle().setRadius(5/Math.PI).getParameter());

    }
}
