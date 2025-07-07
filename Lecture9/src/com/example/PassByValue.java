package com.example;

public class PassByValue {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int res = sum(a, b);
        System.out.printf("a=%d , b=%d, sum = %d", a, b, res);
    }

    public static int sum(int a , int b){
        a += b;
        return a;
    }
}
