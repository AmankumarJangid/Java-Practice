package Challenges.first;

import com.Abstraction.Vehicle;

public class Test {
    public static void main(String[] args) {
        Shape c1 = new Circle(12); // if I use Shape object with Circle child then it will only show the function in shape class not int the circle
        Shape s1 = new Square(12);

        Circle c2 = new Circle();
        c2.setRadius(15);
        System.out.println(c1.calculateArea());

        System.out.println(c2.getClass().getTypeName()+ " : " + c2.calculateArea() );
    }
}