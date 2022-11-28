package day50_Collections_Iterable;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set <Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println(set);// duplicates are not allowed in set

       //Integer [] array = set.toArray(new Integer [0]); Instead of converting it to array, I will convert it
        //to list because list have so many methods coming from Collections Interface

        List<Integer> list = new ArrayList<>(set);
        //we converted set to list now, so we can have index numbers

        System.out.println(list);
        System.out.println("-----------------------------------");
        List <String> names = null;
        //there is no object right now. if we try to use some methods now, it will give NUllPointException
        names.size(); // null point exception is gonna be given because there is no object yet.

        System.out.println("------------------------------------");
        
        //pop()
        
        List <Character> chars = new Stack <>();
        chars.addAll(Arrays.asList('A','B','C','D'));
        System.out.println("chars = " + chars);
        
        ((Stack) chars).pop(); // downcasting because List parent does not have the method Stack has
        System.out.println("chars = " + chars);

        System.out.println("------------------------------------");

        List<String> names2 = new LinkedList<>();
        names2.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        ((LinkedList)names2).poll(); // linkedlist object has the poll method coming from Queue parent
        //but reference type does not have it. so we gotta downcast names2 to LinkedList.


    }
}
