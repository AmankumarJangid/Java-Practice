import java.util.Scanner;

class sumOfAllOddNumberToN{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int i = 1, sum = 0;
        while( i <= number){
            sum+=i;
            System.out.print( i + " ");
            i+=2;
        }
        System.out.println("\nThe sum of all odd number from 1 to " + number + " : " + sum );
    }
}