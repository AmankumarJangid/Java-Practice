package WrapperClasses;

public class WrapClass {
    public static void main(String[] args) {
        Integer num1 = 55; // this is allowed , It automatically converts to object
        Integer num2 = Integer.valueOf(55); // this is allowed
        Integer num3 = Integer.valueOf("1213");  // also allows
//        Integer num3 = new Integer(44); // Depricated in version 9

        System.out.println(Integer.sum(num1 , num2 ));
        System.out.println(Integer.sum(num2, num3));


        ///  assigning null is not allowed in primitive
        // int a = null ; // not allowed
        Integer num4 = null; // allowed

        if( num4 == null) System.out.println("Integer is null");
        num4 = 23;

        if( num4 == null) System.out.println("Integer is null");
        else if( num4 != null) System.out.println("Integer is not null");
    }
}
