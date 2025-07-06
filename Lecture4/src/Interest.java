import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principle amount : ");
        double P = input.nextDouble();
        System.out.print("Enter the Rate of Interest :" );
        double R = input.nextDouble();
        System.out.print("Enter the Time of payback \nwith respect to interest timeline : ");
        int T = input.nextInt();

        // Simple Interest

        System.out.println("\t\tSimple Interest");
        System.out.println((P*R*T)/100);

        System.out.println("\t\tCompoud Interest");
        System.out.println(P*Math.pow((1+(R/100)), T));


    }
}
