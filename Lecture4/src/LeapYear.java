import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a Year : ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if( year % 4 == 0 ) {
            if( year % 100 != 0 ) System.out.println("Leap Year");
            else if( year % 400 == 0 ) System.out.println("Leap Year");
            else System.out.println("Not a leap year");
        }
        else System.out.println("Not a leap year");

        // Method two
        if( (year%4==0&&year%100!=0 || year%400 == 0)) System.out.println("Leap Year");
        else System.out.println("Not a leap year");
    }
}
