package CollectionsPractice.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
//        List strList = new ArrayList(); // Here we are using row use
        // well we ideally we should use List instead of ArrayList whether we should still use ArrayList
        // ,but it helps for polymorphism so that is doesn't matter which type of implementation we use

        //By defining a List without passing any specific object type helps us store anytype of object in the list

        /// best practice
        List<String> strList = new ArrayList<>();
        strList.add("Aman");
        strList.add("Jangid");

//        strList.add(Integer.valueOf(23));
        strList.add(1, "Kumar");
        for( var x : strList ){
            System.out.println(x);
        }

        strList.remove(2);

        if( strList.contains("Aman")){
            System.out.println("It contains Aman at " + strList.indexOf("Aman"));
        }
        for( var x : strList ){
            System.out.println(x);
        }
    }
}
