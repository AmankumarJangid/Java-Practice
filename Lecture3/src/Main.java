import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myName = sc.nextLine();
        System.out.println("My name is "+myName);
        int favorateNumber = sc.nextInt();
        System.out.println("My favorate Number is " + favorateNumber);
        float mySalary = sc.nextFloat();
        System.out.println("My salary is " + mySalary);
        char myCharacter = (char)sc.next().charAt(0);
        System.out.println("My favorate Character is "+myCharacter);
    }
}