import java.util.Scanner;

public class absoluteOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an interger (positive, negative or zero) : ");
        int a = sc.nextInt();
        System.out.println("The absolute of " + a + " is " + ( a>=0?a : (-a)) );
        // alternative
        int abs  = Math.abs(a);
        System.out.println("The absolute of " + a + " is " + abs );

    }
}
