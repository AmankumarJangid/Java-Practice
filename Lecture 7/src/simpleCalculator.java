import java.util.Scanner;

import static java.lang.Double.MIN_VALUE;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    while( true ) {
        System.out.print("Enter 1st number : ");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd number : ");
        double b = sc.nextDouble();
        System.out.print("Enter the operation (+,-,*,/) : ");
        char ch = sc.next().charAt(0);
        double cal = calculate(a, b, ch);
        if( cal == MIN_VALUE){
            System.out.println("Invalid choice of operation");
            System.out.println("Re Enter the values");
            continue;
        }
        System.out.printf("%f %c %f = %f%n", a ,ch , b ,cal);
        System.out.println("Press 'n' to end calculation or else to continue");
        if( sc.next().charAt(0) == 'n'){
            break;
        }

    }
    }

    public static double calculate(double a, double b, char op) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> MIN_VALUE;
        };
    }
}