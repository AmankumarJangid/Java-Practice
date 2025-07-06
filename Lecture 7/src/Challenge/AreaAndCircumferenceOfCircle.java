package Challenge;

import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {

    public static void main(String[] args) {
        final double PI = Math.PI;
        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();
        //Area

        System.out.print("The area of the circle is :");
        System.out.println( PI * R * R);

        //Circumference
        System.out.print("The circumference of the circle is : ");
        System.out.println( PI * 2 * R);

        System.out.println(Math.random()*6);
    }
}
