package com.Aman;

import java.util.Scanner;
public class UserDefinedExcepiton {

    public static void printName( String name) throws IllegalArgumentException{
            if( name.contains("-")){
                throw new IllegalArgumentException("The name containes - ");
            }
        System.out.println(name);
    }
    public static void main(String[] args) throws IllegalArgumentException {

        String name ;
        System.out.println("Enter your name ");

        Scanner sc = new Scanner(System.in);

        name = sc.nextLine();
        try{
        printName(name);
        }
        catch( IllegalArgumentException e){
            System.out.println("Print Failed : " +  e.getMessage());
        }
    }
}
