public class sumOfDigitsOfAInteger {
    public static void main(String[] args) {
        int number  = 23953;
        System.out.println("The sum of digits of " + number + " is " + sumOfDigits( number));
    }
    public static int  sumOfDigits(int number){
        int sum = 0;
        while( number != 0) {
            sum = sum + (number % 10);
            number /= 10;
        }
        return sum;
    }
}
