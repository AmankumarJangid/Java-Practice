public class reverseArray {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        ArrayUtility.printArray(numArray);
        ReverseArray(numArray);

        ArrayUtility.printArray(numArray);
    }

    public static void ReverseArray( int[] array){
        int start = 0;
        int end = array.length-1;
        while( start != array.length/2) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
//        return array;
    }
}
