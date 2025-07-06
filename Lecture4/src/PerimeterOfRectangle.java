import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of sides of the Quadrilateral");
        int[] sides = new int[4];
        System.out.println("The size of array is :" + sides.length);
        for(int i = 1; i <= 4; i++){
            System.out.println("Enter side "+ i + " : ");
            sides[i-1] = input.nextInt();
            sides[0] += sides[i-1];
        }
        System.out.println("The perimeter of the quadrilateral is : " + sides[0]);
    }
}
