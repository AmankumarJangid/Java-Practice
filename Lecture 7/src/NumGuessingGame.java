import java.util.Scanner;

public class NumGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5;
        int guessNumber;
        do{
            System.out.println("Enter a number : ");
            guessNumber = input.nextInt();
        }while( guessNumber != num);
        System.out.println("You won , you guessed the right number");
    }
}
