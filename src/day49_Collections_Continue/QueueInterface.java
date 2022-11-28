package day49_Collections_Continue;

import java.util.*;

public class QueueInterface {

    /*
    **Queue (Interface): duplicates are allowed. insertion order not preserved.
                first-in, first-out order FIFO -> special order


                        *PriorityQueue (Class):
                                Implements queue interface.
                                maintains random order.
                                does not accept null values.

                        *ArrayDeque (Class):
                                Impelemts deque interface
                                maintanin insertion order
                                accepts null values

                        *LinkedList (Class):

     */

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("priorityQueue = " + priorityQueue);

        Queue<Integer> ArrayDeque = new ArrayDeque<>();
        ArrayDeque.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("ArrayDeque = " + ArrayDeque);

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("linkedList = " + linkedList);

        System.out.println("----------------------------------");

        priorityQueue.poll(); // first element is removed in accordance with FIFO
        System.out.println(priorityQueue);
        priorityQueue.poll(); // it will remove again the first one

        ArrayDeque.poll();
        linkedList.poll();

        System.out.println("linkedList = " + linkedList);
        System.out.println("ArrayDeque = " + ArrayDeque);

        System.out.println("----------------------------");

        //System.out.println(priorityQueue.get(1));
        //System.out.println(ArrayDeque.get(1));
        //System.out.println(linkedList.get(1));
        // since they do not have indexes, you can not use get method for those object.
        //however, normally, linkedList has index numbers, but still you can not use get method here now
        //because, according to the rules of PM, reference type has to has the method as well
        //so we gotta downcast

        //System.out.println(((List)linkedList).get(1));

        System.out.println(((LinkedList<Integer>) linkedList).get(1)); // burada ampule absarak otomatik downcasting yaptik
        //<Integer> kafani karistirmasin, otomatik yaptiginda onu da ekleyebiliriyor. onsuz da yapabilirsin.



    }
}
