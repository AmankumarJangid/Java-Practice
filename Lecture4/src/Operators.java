public class Operators {
    public static void main(String[] args) {
        // assignment operators '=' copies the right hand values to the left hand side
        int a = 5;
        System.out.println("Assignment operator '=' use:\n"+"\tThe value in a is " + a);
        // arithmetic operators +,-,*,/,%
        a = 8 ;
        int b = 5;

        System.out.println("a = "+ a + ", b = "+b);
        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));
        System.out.println("a * b = "+ (a*b));
        System.out.println("a / b = "+ (a/b));
        System.out.println("a % b = "+ (a%b));

        //Relational Operator
        // == if value is equal
        // === if value and type both are equal
        // != if value is not equal
        // !== if value and type both not equal

    }
}

// in one file we can only make one public class
