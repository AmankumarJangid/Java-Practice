package Challenges.third;

public class Calculator {
    public static int add(int a , int b){
        return a+b;
    }
    public static int add(int a , int b, int c){
        return a+b+c;
    }

    public static double add( double a , double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1.15 , 1.27));
    }
}
