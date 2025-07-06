import java.util.Scanner;

public class Scoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks you obtained from 0 - 100 : ");

        int marks = sc.nextInt();

        String score = marks > 80 ? "High" : ( marks < 50 ? "Low" : "Moderate");
        System.out.println("The score you obtained is " + score );

    }
}
