import java.util.Scanner;

public class deleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArray = ArrayUtility.inputArray();
        ArrayUtility.printArray(numArray);

        System.out.println("Enter the number you want to delete");
        int numToDelete = input.nextInt();
        int[] newArray = deleteArray( numArray, numToDelete);
        System.out.println("\nArray after deletion of " + numToDelete + " is ");
        ArrayUtility.printArray(newArray);
    }

    public static int[] deleteArray( int[] array, int numToDelete){
        int occ = OccurrencesInArray.noOfOccurrences(array, numToDelete);
        int newSize = array.length - occ;
        int[] newArray = new int[newSize];

        int i = 0, j = 0;
        while( i < array.length){
            if( array[i] != numToDelete){
                newArray[j] = array[i];
                j++;
            }
            i++;
        }
        return newArray;
    }
}
