package Challenges.challenge89;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class challenge93ReverseList {

    public static <E> void reverseList(List<E> list){
        int n = list.size();
        for( int i = 0 ; i < n/2; i++){
            ListUtility.swap(list, i , (n-i-1));
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(list);
        Collections.reverse(list); // collections method
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        reverseList(list);
        System.out.println(list);


    }
}
