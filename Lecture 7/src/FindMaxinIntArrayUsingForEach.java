import java.util.Scanner;

public class FindMaxinIntArrayUsingForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int[] arr = ArrayUtility.inputArray();
        for( int x : arr){
            if( x > max){
                max = x;
            }
        }
        System.out.println("The max element in array is : " + max );
    }
}
