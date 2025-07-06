import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which number multiplication table you want : \n Enter the number :");
        int number = input.nextInt();
        for( int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " =\t" + (number * i));
        }
    }
}