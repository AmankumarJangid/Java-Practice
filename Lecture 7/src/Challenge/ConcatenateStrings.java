package Challenge;

import java.util.Scanner;


public class ConcatenateStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string one : ");
        String a = input.next()+" ";
        System.out.println("Enter string two : ");
        String b = input.next();

        System.out.println( (a+b).toUpperCase());
    }

}
