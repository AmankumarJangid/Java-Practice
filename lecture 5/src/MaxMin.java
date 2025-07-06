public class MaxMin {
    public static void main(String[] args) {
        System.out.println("Welcome to min and max of array ");
        int[] array = ArrayUtility.inputArray();
        ArrayUtility.printArray(array);
        System.out.println();
        System.out.println("Max of the array is " + max(array));
        System.out.println("Min of the array is " + min(array));
    }
    public static int min(int[] array){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while ( i < array.length){
            if( array[i]  < min ) min = array[i];
            i++;
        }

        return min;
    }
    public static int max(int[] array){
        if( array.length == 0 )
            return Integer.MIN_VALUE;

        int max = array[0];
        int i = 1;
        while( i < array.length){
            if( array[i] > max ) max = array[i];
            i++;
        }
        return max;
    }
}

