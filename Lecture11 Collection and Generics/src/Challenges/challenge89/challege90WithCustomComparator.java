package Challenges.challenge89;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class challege90WithCustomComparator {

    final static Comparator<String> descending = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            if (o1.equals(o2)) return 0;
            else if (o1.charAt(0) < o2.charAt(0)) {
                return 1; // negative then it will be placed first and if positive then it will be placed second
            } else {
                return -1;
            }
        }
    };
    final static Comparator<String> accending = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            if (o1.equals(o2)) return 0;
            else if (o1.charAt(0) < o2.charAt(0)) {
                return -1; // negative then it will be placed first and if positive then it will be placed second
            } else {
                return 1;
            }
        }
    };
    // for which -1 is return it is place first and in 1 is return it is placed secodn awq


    public static void  sortInDescending(List<String> stringList){
        Collections.sort(stringList, descending);
    }
    public static void  sortInAccending(List<String> stringList){
        Collections.sort(stringList, accending);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear" , "Lion" ,"Tiger" ,"Pigeon");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list); // we can also use direct println
        sortInAccending(list);
        System.out.println(list); // we can also use direct println

    }
}
