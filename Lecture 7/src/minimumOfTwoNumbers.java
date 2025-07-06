import java.util.Scanner;

public class minimumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter a second number ");
        int b = sc.nextInt();
        System.out.println("The minimum of " + a + " and " + b + " is " + (a<b?a:b));
        // alternative
        int min = Math.min(a, b);
        System.out.println("The minimum of " + a + " and " + b + " is " + min);
        System.out.println(a + " is odd or even :" + (a%2==0?"Even":"Odd"));
        System.out.println(b + " is odd or even :" + (b%2==0?"Even":"Odd"));
    }
}
