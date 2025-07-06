import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] num2DArray = ArrayUtility.inputArray2D();
        ArrayUtility.print2DArray(num2DArray);
        Scanner input = new Scanner(System.in);
        System.out.print("The item you want to search in array : " );
        int item = input.nextInt();
        System.out.println("The no. of occurances of " + item + "in 2D array is : " + searchOccurencesArray2( num2DArray, item));
    }

    public static int searchOccurencesArray2( int[][] array, int item){
       int occ = 0;
       for(int[] i : array){
           for( int j : i){
               if( item == j ) occ++;
           }
        }
        return occ;
    }
}
