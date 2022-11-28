package day49_Collections_Continue;

import java.util.*;

public class SetInterfacePractice {
    /*
    **Set (Interface): does not accept duplicates. child interface of Collection.
                            insertion order not preserved
                            does not have index

                        *HashSet (Class): order is random. implements set interface. accepts null values.
                                            since there is no order, it is faster. most commonly used in set.

                                -LinkedHashSet (Class): keeps the insertion order as it is

                        *SortedSet:

                                -TreeSet (Class): keeps the sorted order in ascending order
                                         does not accept null

     */

    public static void main(String[] args) {

        Set <Integer> hashSet = new HashSet<>();
        // if you dont worry about the order, then HashSet is the best option as it is the fastest
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("hashSet = " + hashSet);
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        //since dublicates are not allowed, they are not gonna be inside the HasList.

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90, null));
        System.out.println("linkedHashSet = " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(10,200,300,40,90));
        System.out.println("treeSet = " + treeSet);








    }
}
