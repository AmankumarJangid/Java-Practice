package CollectionsPractice.SetInterface;

import CollectionsPractice.Utility;

import java.util.*;
public class SetTest {
    public static void main(String[] args) {

        Set<String>  names = new HashSet<>();
        System.out.println(names.add("Aman"));
        System.out.println(names.add("Jangid"));
        System.out.println(names.add("Jangid"));

        Utility.print(names);

        System.out.println(names.remove("Jangid"));
        System.out.println(names.contains("Jangid"));
        System.out.println(names.size());

///  Set can't maintain the order It will not
        Utility.print(names);

    }
}
