import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = input.nextInt();
        if( number == reverseTheDigit( number )) System.out.println("The given number is a Palindrome number");
        else System.out.println("The given number is not a Palindrome number");
    }
    public static int reverseTheDigit(int num ) {
        int reverse = 0;
        while( num != 0 ){
            reverse =  reverse*10 + (num % 10);
            num /= 10;
        }
        return reverse;
    }
}
