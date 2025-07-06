package old.Aman;
import java.io.*;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerandBufferReader {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();

            StringTokenizer tokenizer = new StringTokenizer(input);

            while (tokenizer.hasMoreTokens()) {
                try{
                    int a = Integer.parseInt(tokenizer.nextToken());
                    System.out.print( a + " ");
                }
                catch(NumberFormatException e){
                }

            }
            System.out.println();
        }
        catch(IOException e){
            e.printStackTrace();
            }

    }
}

/*
 import java.math.BigInteger;

 public class BigIntegerExample {
     public static void main(String[] args) {
         // Creating BigInteger objects
         BigInteger num1 = new BigInteger("12345678901234567890");
         BigInteger num2 = BigInteger.valueOf(9876543210L);

         // Arithmetic operations
         BigInteger sum = num1.add(num2);
         BigInteger difference = num1.subtract(num2);
         BigInteger product = num1.multiply(num2);
         BigInteger quotient = num1.divide(num2);
         BigInteger remainder = num1.remainder(num2);

         // Comparison
         int comparisonResult = num1.compareTo(num2); // -1, 0, or 1

         // Other operations
         BigInteger absoluteValue = num1.abs();
         BigInteger power = num1.pow(5);
         BigInteger gcd = num1.gcd(num2);

         // Output
         System.out.println("Sum: " + sum);
         System.out.println("Difference: " + difference);
         System.out.println("Product: " + product);
         System.out.println("Quotient: " + quotient);
         System.out.println("Remainder: " + remainder);
         System.out.println("Comparison: " + comparisonResult);
         System.out.println("Absolute Value: " + absoluteValue);
         System.out.println("Power: " + power);
         System.out.println("GCD: " + gcd);
     }
 }
* */