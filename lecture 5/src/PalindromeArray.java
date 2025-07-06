public class PalindromeArray {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        ArrayUtility.printArray(numArray);

        boolean palindromeArray = IsPalindrome(numArray);
        ArrayUtility.printArray(numArray);

        System.out.println("The given array is Palindrome ( TRUE/FALSE):" + palindromeArray);
    }

    public static boolean IsPalindrome( int[] array){
        int start = 0;
        boolean isPalindrome = true;
        int end = array.length-1;
        while( start != array.length/2) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            if( array[start] != array[end])
                isPalindrome = false;
            start++;
            end--;
        }
        return isPalindrome;
    }
}
