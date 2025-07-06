public class isSortedOrNot {
    public static void main(String[] args) {
        System.out.println("Welcome , where we check if a array is sorted of not ");
        int[] array = ArrayUtility.inputArray();

        if( ArrayUtility.isSorted(array)){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }
















//        boolean isInc = isIncreasing(array);
//        boolean isDec = isDecreasing(array);
//
//        if( isInc || isDec){
//            System.out.println("The array is sorted");
//        }
//        else {
//            System.out.println("The array is not sorted");
//        }
    }
//    public static boolean isIncreasing( int[] array){
//        int i = 0;
//        while( i < array.length-1){
//            if( array[i] > array[i+1]) {
//                return false;
//            }
//            i++;
//        }
//        return true;
//    }
//    public static boolean isDecreasing( int[] array){
//        int i = 0;
//        while( i < array.length-1){
//            if( array[i] < array[i+1]) {
//                return false;
//            }
//            i++;
//        }
//        return true;
//    }
}
