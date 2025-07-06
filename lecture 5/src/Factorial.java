import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number: " );
        Scanner input = new Scanner(System.in);
        long number = input.nextInt();
        System.out.println("The factorial of number " + number + " is " + factorial(number) );
    }
    public static long factorial( long num ) {
        if( num < 0 ) {
            System.out.println("Invalid number");
            return -1;
        }
        if( num == 1 || num == 0) return 1;
        return num * factorial(num-1l);
    }


}
