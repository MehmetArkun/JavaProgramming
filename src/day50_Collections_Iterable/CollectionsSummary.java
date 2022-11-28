package day50_Collections_Iterable;

public class CollectionsSummary {

    /*
    Data structures: work with data

    Array
    Collection
    Map

    Array: size is fixed. supports primitive and non-primitives.

    Collection:
        Consisting of multiple interfaces. Each Interface is implemented by classes.
        A group of individual objects as a single entity
        Defines several classes and interfaces which can be used to represent a group of objects as single entity
        Growable in nature as they increase and decrease in size: dynamic
        Can hold different non-primitive data types
        Standard data structure and there are ready methods to use
        Collections has lots of methods, so it will be more useful compared to Arrays for instance
        Collecton interface is consdiered as root interface of collection framework
        Collection interface defines the most common methods which are applicable for any collection object
        size, isEmpty, add, addAll, remove, removeAll, removeIf, contains, containsAll, retainAll, clear, toArray
        Extended by List, Set, Queue

        ***Collection (Interface) : Size is dynamic
                            supports non-primitives only

                **List (Iinterface): Accepts duplicates, has index numbers

                        *ArrayList (Class): Uses arrays internally.
                                            accessing/retriving/searching the elements via get() is faster
                                            most of the time you will be using ArrayList as you will need it to contain and retrieve the elements
                                            most of the time insertion will be unlikely
                                            the most commonly used list

                        *LinkedList (Class): Uses doubly linked list internally.
                                             adding/removing elements via add()/remove() is faster
                                             imoplements queue as well
                                             maintains insertion order

                        *Vector (Class): internally uses array.
                                     is Synchronized == Thread-safe (one thread at a time in multi-thread environment
                                     methods of vector use synchronized keyword

                                   -Stack (Class): child class of Vector. synchronized (thread-safe)
                                                last-in, first out order (LIFO)
                                                as soon as we call pop() method, it throws the last inserted element


                **Set (Interface): Does not accept duplicates. Does not have index
                                    child interface of Collection.
                                    insertion order not preserved

                        *HashSet (Class): order is random. implements set interface. accepts null values.
                                            since there is no order, it is faster. most commonly used in set.

                                -LinkedHashSet (Class): keeps the insertion order as it is

                        *SortedSet:

                                -TreeSet (Class): Maintains sorted order
                                         does not accept null. NullPointException


                **Queue (Interface): Duplicates are allowed. Does not have index.
                Insertion order not preserved.
                first-in, first-out order FIFO -> special order, poll()


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






    }
}
