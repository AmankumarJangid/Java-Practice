import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base of the triangle : ");
        float base = input.nextFloat();
        System.out.println("Now Enter height of the triangle : ");
        float height = input.nextFloat();
        System.out.println("The area of the given triangle is : " + ((base*height)/2));

    }
}
