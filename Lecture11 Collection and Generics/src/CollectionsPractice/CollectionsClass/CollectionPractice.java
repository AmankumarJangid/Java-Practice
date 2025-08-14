package CollectionsPractice.CollectionsClass;

import CollectionsPractice.Utility;

import java.util.*;
///  '❤️Collections provides various method for the Collections datastruction such list , set , map , queue etc
public class CollectionPractice {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();

        numList.add(1);
        numList.add(5);
        numList.add(3);
        numList.add(9);

        Utility.print(numList);

        Collections.sort(numList);
        Utility.print(numList);

        Collections.reverse(numList);
        Utility.print(numList);

        System.out.println(Collections.min(numList));
        System.out.println(Collections.max(numList));

        Collections.shuffle(numList); // shuffle elements randomly

        Utility.print(numList);

        Collections.shuffle(numList); // shuffle elements randomly

        Utility.print(numList);

        List<Integer> unmodifiable = Collections.unmodifiableList(numList); // create an unmodifiable list from a Normal list
        //now on adding

        try{
            unmodifiable.add(21); // here it won't work as the list is immuatable

        }
        catch(UnsupportedOperationException e){
            System.out.println("UnsupporetdOperationExcetpion : " + "Immutable list " + e.getCause() + " " + e.getMessage());
        }


        Collections.addAll(numList , 5, 6, 3, 2, 1 ,3 , 12 );

        Utility.print(numList);

    }
}
