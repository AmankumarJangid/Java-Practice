package Challenges.challenge89;

import java.util.*;
public class challege91FrequencyWIthCollections {
    public static void main(String[] args) {
        List<Integer> list = List.of(12 ,2 ,12 ,5 ,234 , 8 , 23, 9, 24, 54 , 23 ,23, 0);

        System.out.println(Collections.frequency(list , 1));
        System.out.println(Collections.frequency(list , 4));
        System.out.println(Collections.frequency(list , 12));
        System.out.println(Collections.frequency(list , 23));
    }
}
