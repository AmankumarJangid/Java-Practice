package Challenges.challenge89;

import CollectionsPractice.Utility;

import java.util.*;

public class challege90ComparatorSortStrings {
    public static void  sortInDescentding(List<String> stringList){
        Collections.sort(stringList);
        Collections.reverse(stringList);
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear" , "Lion" ,"Tiger" ,"Pigeon");
        System.out.println(list);
        sortInDescentding(list);
        System.out.println(list); // we can also use direct println

    }
}
