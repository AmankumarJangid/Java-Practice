import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = input.nextInt();
        System.out.println("The fibonacci series is : \n" );
        Fibonacci( number );
    }

    static void Fibonacci(int number) {
        int n0 = 0;
        int n1 = 1;
        int temp = 0;
        System.out.print( "0 ");
        while( n1 < number){
            System.out.print( n1 + " ");
            temp = n0 + n1;
            n0 = n1;
            n1 = temp;
        }
    }
}
//0 1 1 2