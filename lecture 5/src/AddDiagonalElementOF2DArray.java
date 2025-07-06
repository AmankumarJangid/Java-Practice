import java.lang.reflect.Array;

public class AddDiagonalElementOF2DArray {

    public static void main(String[] args) {
        int[][] array = ArrayUtility.inputArray2D();
        ArrayUtility.print2DArray(array);
        System.out.println("The sum of diagonal is " + sumOfDiagonal(array));

    }

    public static int sumOfDiagonal(int[][] array){
        int sum = 0;
        sum = LeftDiagonalSum(array) + RightDiagonalSum(array);
        if( array.length % 2 !=0 ){
            int mid = array.length/2;
            sum -= array[mid][mid];
        }
        return sum;
    }

    public static int LeftDiagonalSum( int[][] array){
        int sum = 0;
        int i = 0;
        while( i < array.length ){
            sum += array[i][i];
            i++;
        }
        return sum;
    }
    public static int RightDiagonalSum(int[][] array){
        int sum = 0;
        int i = 0 , j = array.length-1;
        while( i < array.length ){
            sum += array[i][j];
            j--; i++;
        }
        return sum;
    }
}
