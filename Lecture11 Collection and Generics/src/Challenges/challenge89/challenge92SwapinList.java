package Challenges.challenge89;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class challenge92SwapinList {
    public static <E> void swapListElements(List<E> list , int i , int j){
        try{
            E temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
        catch( IndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2,3,4,5,6,7,8,9,10));

        // List.of creates an immutable list

        System.out.println(list);
        swapListElements(list, 3, 6);

        System.out.println(list);
    }
}
