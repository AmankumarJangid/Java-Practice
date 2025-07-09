package VariableArguments;

import org.w3c.dom.ls.LSOutput;

public class VarArgs {

    ///  To set that it minimum needs two values so we just use two arguments before using values
    public static int sum(int first , int second, int ...values){ // varargs is just a beautification of arrays
        // ' ... ' this operator is called ellipsis.
        int sum = first + second;
        for( int x : values){
            sum+= x;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6)); // no boundation or limitation of no. of arguments
        System.out.println(sum(1342,1213));
        System.out.println(sum(1,-1,1,-1));
//        System.out.println(sum(1)); // this will give an error
        System.out.println(sum( 2, 1 ,new int[]{12 ,23 ,23,23})); // can also provide array as argument

    }
}
