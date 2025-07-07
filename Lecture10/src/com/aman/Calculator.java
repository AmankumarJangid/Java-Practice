package com.aman;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This is a division calculator");
        System.out.println("Enter two numbers respectively");

        int first = input.nextInt();
        int second = input.nextInt();

        int res = first/second;

        System.out.println(res);
    }
}
