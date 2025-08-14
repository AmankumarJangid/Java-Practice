package VariableArguments;

public class VarArgs2 {
    /// allows users to accept any number of arguments
    ///  to do this use Ellipsis { ... } operator eg void method(String ...elements);

    // is is then acts as a array of element with can traversed like this for( String element : elements )
    ///  varArgs must always be last parameter in the all parameters
//    Similar to - public static int sum( int[] a)
    public static int sum(int a , int b , int... values){
        int res = a+b;

        for (int value : values) {
            res += value;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("sum :" + sum(2, 3 , 4 ,5,6,7,8,9,0));
    }

}
