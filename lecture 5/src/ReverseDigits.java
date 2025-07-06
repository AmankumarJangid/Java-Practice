public class ReverseDigits {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("The Reverse of " + num + "is : " + reverseTheDigit( num));
    }
    static int reverseTheDigit(int num ) {
        int reverse = 0;
        while( num != 0 ){
            reverse =  reverse*10 + (num % 10);
            num /= 10;
        }
        return reverse;
    }
}
