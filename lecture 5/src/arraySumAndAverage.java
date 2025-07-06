//import java.util.Scanner;

public class arraySumAndAverage {
    public static void main(String[] args){
        int[] array = ArrayUtility.inputArray();
        int i = 1;
        while( i < array.length) array[0] += array[i++];

        System.out.println("The sum of array is : " + array[0]);
        System.out.println("And The average is : " + ((double)array[0]/array.length));

    }

}

