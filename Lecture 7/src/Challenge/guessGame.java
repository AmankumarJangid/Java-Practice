package Challenge;

import java.util.Scanner;

public class guessGame {
    private int number;

    public static Scanner input = new Scanner(System.in);

    public void compute(){
        number = (int)(Math.random() * 10 )+1;
    }

    {
        System.out.println("Hello this is a guessGame Object");
    }
    public void guess(){
//        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 - 10 ");
        int guessNum = input.nextInt();
        if( guessNum == number){
            System.out.println("You guessed right!");
        }
        else{
            System.out.println("You guess was wrong!");
        }
    }

    public static void main(String[] args) {
        guessGame game = new guessGame();

        char c;
        do{
            game.compute();
            game.guess();
            System.out.println("Want to continue playing press y else n");
            c = input.next().charAt(0);
        }while( c == 'y' );
    }
}
