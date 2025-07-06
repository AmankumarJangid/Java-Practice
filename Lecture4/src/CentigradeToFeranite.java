import java.util.Scanner;

public class CentigradeToFeranite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Temperature in Feranite : ");
        float F = input.nextFloat();
        float C = (F - 32) * 5/9;
        System.out.println("The Temperature in Celesius is : " + C);
    }
}
