package CollectionsPractice.QueueInterface;

import CollectionsPractice.Utility;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        /// These methods throw exceptions if unsuccessful
        // add() , remove() , element()
        ///  These will just give null or boolean value
        // offer() , poll(), peek()

        queue.add(1);
        queue.offer( 10);

        Utility.print(queue);

        System.out.println(queue.peek());
        System.out.println(queue.element());

        System.out.println(queue.poll());
        System.out.println(queue.remove());
            System.out.println(queue.poll());

        try{
        System.out.println(queue.remove());
        }
        catch(Exception err){
            System.out.println("Exception element: " + err.getMessage());
        }
    }
}
