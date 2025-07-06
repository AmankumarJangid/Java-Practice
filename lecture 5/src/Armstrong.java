import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        isArmstrong( number);
    }

     static void isArmstrong(int number) {
        int sum = 0;
        int temp = number;
        int digit = 0;
        while( temp != 0){
            temp /= 10;
            digit++;
        }
        temp = number;
        while( temp != 0) {
            sum = sum + (int)Math.pow( temp % 10 , digit);
            temp /= 10;
        }
        if( sum == number ) System.out.println("The given is a Armstrong number");
        else System.out.println("The given number is not a Armstrong number");
    }

}
