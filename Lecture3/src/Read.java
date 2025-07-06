import java.util.Scanner;
public class Read {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.nextLine();
        System.out.println(name + " ,Enter two numbers separated by space :");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        System.out.println("The sum of given two number is :" + (num1+num2));
    }
}