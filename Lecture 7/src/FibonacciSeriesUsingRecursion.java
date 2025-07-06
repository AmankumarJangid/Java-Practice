import java.util.Scanner;
// not good for a larger and number since it has a complexity of n! so we should no use it

public class FibonacciSeriesUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the fibonaaci series ");
        System.out.println("Enter a number of elements to be printed");
        int count = input.nextInt();
        for( int i = 1; i <= count ; i++){
            System.out.println(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int position){
        System.out.print('.');
        if( position == 1 ) return 0;
        if( position == 2 ) return 1;
        return fibonacci(position-1) + fibonacci(position-2);
    }
}
