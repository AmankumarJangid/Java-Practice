package com.Aman;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        a();
//    catch(ArithmeticException e){
//        System.out.println("Divide by zero : Enter a valid value");
//        System.out.println(e.getMessage());
//    }
//    catch(ArrayIndexOutOfBoundsException e){
//        System.out.println("Array is out of bound");
//    }
    }

    public static void a(){
        b();
    }
    public static void b(){
        c();
    }
    public static void c(){
        d();
    }
    public static void d(){
        Scanner input = new Scanner(System.in);

        System.out.println("This is a division calculator");
        System.out.println("Enter two numbers respectively");

        int first = input.nextInt();
        int second = input.nextInt();
        try{
            int[] arr = new int[5];
//            System.out.println(arr[6]); // it will run this
            int res = first/second;

            System.out.println(res);
        }
//        catch(ArithmeticException e){
////    catch(ArithmeticException | ArrayIndexOutOfBoundsException e){ // multiple exception can using PIPE Operator ( | )
//            System.out.println("Multiple Exception");
//        }
        catch( Throwable e){ // or can (Throwable t) to catch any kind exception or error
            System.out.println("Last Exception");
            throw e;
        }
        // It always runs
        finally { // runs even if exception is handled or not
            System.out.println("I am in finally");
        }
    }
}
