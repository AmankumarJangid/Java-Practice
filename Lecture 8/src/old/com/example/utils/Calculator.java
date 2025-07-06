package old.com.example.utils;

import old.com.example.geometry.*;
public class Calculator {

    public static void main(String[] args) {

    Circle C1 = new Circle(5.5);
    Rectangle R1 = new Rectangle(10, 2);

    double circleArea = Math.PI * C1.radius * C1.radius;
    double rectArea = R1.length * R1.width;

        System.out.printf("The area of circle is %f \n The area of rectangle is %f", circleArea , rectArea);
    }
}
