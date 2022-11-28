package day48_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ChildInterface_List_Intro {

    /*
    Child interface of Collection
    Duplicates are allowed
    Insertion order preserbed: whicever elemtn you insert first, it will stay as first. same for the last one.
    Has index numbers
        These three features are what make List different than other collection types

    ArrayList, LinkedList, Vector & Stack have IS RELATION with List.

    ArrayList
        Implements List interface
        Internally uses array
        Retrieving the element is faster: benefit. When you use get method provdided by List interface, ArrayList is faster.

    LinkedList
        Implements list interface
        internally uses doubly linked list
        each value will have pointer ot the next value
        inserting and deleting the elemnt is faster: increasing and decreasing the size is faster. add and remove methods.

    Vector
        implements interface
        Similar to arraylist: difference is synchronization
        it is synchronized (thread-safe):
     */

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        //polly -> list referenceing to ArrayList object
        List<Integer> list2 = new Vector<>();


    }
}
