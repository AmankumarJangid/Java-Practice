import java.util.Scanner;

public class OccurrencesInArray {
    public static void main(String[] args) {
        System.out.println("Welcome to number of Occurrences of an element program");
        int[] array = ArrayUtility.inputArray();

        ArrayUtility.printArray(array);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the element you want to find in array : ");
        int element = input.nextInt();

        int occurrence = noOfOccurrences(array, element);

        System.out.println("Number of occurrence is " + occurrence);

    }
    public static int noOfOccurrences(int[] array, int element) {

        int numOfTimes = 0;
        // old for ( int i = 0; i < array.length; i++)
        for (int j : array) { // new for loop with range
            if (j == element) ++numOfTimes;
        }
        return numOfTimes;
    }
}
