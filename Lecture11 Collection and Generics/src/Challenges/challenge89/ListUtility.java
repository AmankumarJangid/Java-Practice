package Challenges.challenge89;

import java.util.List;

 public class ListUtility {
    public static <E> void swap(List<E> list , int i , int j){
        try{
            E temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
        catch( IndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }

    }


}
