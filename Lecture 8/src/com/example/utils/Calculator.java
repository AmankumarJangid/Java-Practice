package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

import java.util.Scanner;

public class Calculator {
    private static Circle c1 = new Circle();
    private static Rectangle r1 = new Rectangle();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle");
        c1.setRadius(input.nextDouble());
        System.out.printf("Circle area = %f , Circle's parameter = %f \n" ,c1.getArea() , c1.getParameter());

        System.out.println("Enter the length and width respectively for rectangle");
        r1.setDimension(input.nextDouble(), input.nextDouble());

        System.out.printf("The area of rectangle is %f\n", r1.getArea());

    }
}
