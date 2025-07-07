package com.Aman;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This is a division calculator");
        System.out.println("Enter two numbers respectively");

        int first = input.nextInt();
        int second = input.nextInt();
    try{
        int[] arr = new int[5];
        System.out.println(arr[6]); // it will run this
        int res = first/second;

        System.out.println(res);
    }
    catch(ArithmeticException e){
//    catch(ArithmeticException | ArrayIndexOutOfBoundsException e){ // multiple exception can using PIPE Operator ( | )
        System.out.println("Multiple Exception");
        }
    catch( Exception e){ // or can (Throwable t) to catch any kind exception or error
        System.out.println("Last Exception");
    }
//    catch(ArithmeticException e){
//        System.out.println("Divide by zero : Enter a valid value");
//        System.out.println(e.getMessage());
//    }
//    catch(ArrayIndexOutOfBoundsException e){
//        System.out.println("Array is out of bound");
//    }
    }
}
