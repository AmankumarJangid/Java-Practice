import java.util.Scanner;

public class OddEvenUsingBitwiseOperators {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if( (num & 1) == 0 ) System.out.println("Even");
        else System.out.println("Odd");
    }
}
// Single line Comments
/* Multiline comments */
/** Documentation comment */