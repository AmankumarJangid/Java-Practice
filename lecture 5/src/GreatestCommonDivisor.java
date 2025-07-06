import java.util.Arrays;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int num1 = 76;
        int num2 = 12;
        System.out.println("The GCD of " + num1 + " and " + num2 + " is : \nBasic: " + GCD(num1, num2));
        System.out.println("Extended : " + GCD2(num1, num2));
    }

    //method 1 basic Euclidean Algorithm
    static int GCD(int num1, int num2) {
        if (num1 == num2)
            return num1;
        if (num1 > num2) return GCD(num1 - num2, num2);
        else return GCD(num1, num2 - num1);
    }

    //method 2 extended Euclidean Algorithm
    static int GCD2(int num1, int num2) {
        if (num1 == 0) return num2;
        return GCD2(num2 % num1, num1);
    }




}