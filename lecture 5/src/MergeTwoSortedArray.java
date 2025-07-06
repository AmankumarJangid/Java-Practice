public class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("Input the first Array : ");
        int[] first = ArrayUtility.inputArray();
        System.out.println("Input the second Array : ");
        int[] second = ArrayUtility.inputArray();

        System.out.print("First Array : ");
        ArrayUtility.printArray(first);
        System.out.print("Second Array : ");
        ArrayUtility.printArray(second);

        int[] mergedArray = mergetwoSortedArray(first, second);
        System.out.println("New merged array is : ");
        ArrayUtility.printArray(mergedArray);

    }

    public static int[] mergetwoSortedArray( int[] first , int[] second){
        int newSize = first.length + second.length;
        int[] mergedArray = new int[newSize];

        int i = 0, j = 0, k = 0;
        while( i < first.length || j < second.length){
            if( j == second.length /* short circuiting */ ||
                    ( i < first.length &&  first[i] < second[j] )){
                mergedArray[k] = first[i];
                i++;

            }
            else{
                mergedArray[k] = second[j];
                j++;
            }
                k++;

        }
        return mergedArray;
    }
}

