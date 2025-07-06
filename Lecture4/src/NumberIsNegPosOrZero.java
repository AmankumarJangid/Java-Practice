import java.util.Scanner;

class NumberIsNegPosOrZero {
     public static void main(String[] args) {
         System.out.println("Please Enter a number : ");
         Scanner input = new Scanner(System.in);
         int number = input.nextInt();
         if(number > 0) System.out.println("Positive!");
         else if(number < 0) System.out.println("Negative!");
         else System.out.println("Zero");
     }
}
