import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        System.out.print("Enter size of array : ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        int i = 0;

        while( i < size){
            System.out.println("Enter element no. " + (i+1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        return array;
    }

    public static int[][] inputArray2D(){
        System.out.print("Enter size of 2D array (m,n): ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] array = new int[m][n];
        for( int i = 0; i < m; i++){
            for( int j = 0; j < n; j++){
                System.out.print("Enter element " + (i+1) + "," + (j+1) + " : ");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }

    public static void printArray(int[] array){
        for( int i : array){
            System.out.print(i  + " ");
        }
        System.out.println();
    }

    public static void print2DArray( int[][] array){
        for( int[] i: array){
            System.out.print("[ ");
            for( int j : i){
                System.out.print( j + " ");
            }
            System.out.println("]");
        }
    }

    public static boolean isIncreasing( int[] array){
        int i = 0;
        while( i < array.length-1){
            if( array[i] > array[i+1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing( int[] array){
        int i = 0;
        while( i < array.length-1){
            if( array[i] < array[i+1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isSorted( int[] array){
        return isIncreasing(array) || isDecreasing(array);
    }
}
