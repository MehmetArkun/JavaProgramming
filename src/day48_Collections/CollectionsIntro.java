package day48_Collections;

import java.util.*;

public class CollectionsIntro {

    /*

    Data structures: work with data

    Array
    Collection
    Map

    Array: size is fixed. supports primitive and non-primitives.

    Collection: a group of indiviudl objects as a single entity
        Defines several classes and interfaces whcuh can be used to represent a group of objects as single entity
        Growable in nature as they increase and decrease in size: dynamic
        Can hold different non-primtive data types
        Standard data structure and there are ready methods to use
        Collections has lots of methods, so it will be more useful compared to Arrays for instance
        Collecton interface is consdiered as root interface of collection framework
        Collection interface defines the most common methods which are applicable for any collection object
        size, isEmpty, add, addAll, remove, removeAll, removeIf, contains, containsAll, retainAll, clear, toArray

        ***Collection (Interface) : Size is dynamic
                            supports non-primitives only

                **List (Iinterface): accepts duplicates, has index numbers

                        *ArrayList (Class): Uses arrays internally.
                                            accessing/retriving the elements via get() is faster
                                            most of the time you will be using ArrayList as you will need it to contain and retrieve the elements
                                            most of the time insertion will be unlikely
                                            the most commonly used list

                        *LinkedList (Class): Uses doubly linked list internally.
                                             adding/removing elements via add()/remove() is faster
                                             imoplements queue as well

                        *Vector (Class): internally uses array.
                                     is Synchronized == Thread-safe (one thread at a time in multi-thread environment
                                     methods of vector use synchronized keyword

                                   -Stack (Class): child class of Vector. synchronized (thread-safe)
                                                last-in, first out order (LIFO)
                                                as soon as we call pop() method, it throws the last inserted element


                **Set (Interface): does not accept duplicates. child interface of Collection.
                            insertion order not preserved
                            does not have index

                        *HashSet (Class): order is random. implements set interface. accepts null values.
                                            since there is no order, it is faster. most commonly used in set.

                                -LinkedHashSet (Class): keeps the insertion order as it is

                        *SortedSet:

                                -TreeSet (Class): keeps the sorted order
                                         does not accept null


                **Queue (Interface): duplicates are allowed. insertion order not preserved.
                first-in, first-out order FIFO -> special order


                        *PriorityQueue (Class):
                                Implements queue interface. maintains random order.
                                does not accept null values.

                        *ArrayDeque (Class):
                                Impelemts deque interface
                                maintanin insertion order
                                accepts null values



        Synchronized: threads are being executed one thread at a time in multi-threading environment
                    advantage: thread-safe, steady.
                    disadvantage: slower because threads have to wait in queue contrary to the case in usage of ArrayList
                    synchronized keyword is used to implement thread safety

       Process: execution instance of program

       Thread: a sequence of execution within process

       multi-threading: two or more threads being executed within the process

       multitasking: multiple processes (two or more) being executed

       concurrently vs parallel execution:
            -if you have so many test cases in your regression, parallel executin is better. it saves time.
            concurrently: 1000 * 5 ===> 5000 seconds ===> 10000 threads
                        chrome browser (process)
            parallel:
                    chrome browser1 (process) ===> 2000 threads
                    chrome browser2 (process) ===> 2000 threads
                    chrome browser3 (process) ===> 2000 threads
                    chrome browser4 (process) ===> 2000 threads

     */

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list1.get(0));// this one implements get() method faster than the others

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(10, 20, 30, 40, 50, 60)); // this one implements add() method faster than the others
        System.out.println(list2.get(0));

        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list3.get(0));

        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list4.get(0));

        System.out.println(list4);

        ((Stack)list4).pop(); // downcasting, List reference type'ta pop() methodu yok, o yuzden
        //60 is gone
        System.out.println(list4);


        ((Stack)list4).pop(); // 50 is gone
        System.out.println(list4);


    }



}
