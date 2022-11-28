package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListMethod2 {

    public static void main(String[] args) {

        ArrayList <Integer> list =new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
        int num = 1;
        list.remove(num); // primitive perceived as index number

        Integer number = 200;
        list.remove(number); // non-primitive perceived as object

        boolean r = list.remove(number);

        System.out.println("------------");

        //clear(): removes all the elements of the arraylist, size will be zero (0)

        System.out.println(list.size());

        list.clear();

        System.out.println(list.size());
        System.out.println(list);

        System.out.println("===-----------------");

        //indexOf(Data) returns the first matching one at the index given

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A'); // 0
        int b = characters.lastIndexOf('A'); // 4

        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------------");

        // contains methods is used in the same way it is used in string

        boolean r2 = characters.contains('A'); // true
        boolean r3 = characters.contains('Z'); // false

        System.out.println("---------------");

        // equals - if you compare two objects like string to string, then you gottta use equals method
        // if you compare two primitives, then you gotta use equal logical operator

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2); // they are diffrent two objects created in heap memory separetley
        //so boolean result is false beacaseu we used logical equal operator

        System.out.println(list1.equals(list2)); // true because same elements in same order

        System.out.println("-=------------------------");

        // isEmpty checks if the size is set to zero

        System.out.println("--------------------------");

        boolean r4 = list1.isEmpty(); // false
        list1.clear();
        r4 = list1.isEmpty(); // now true

        System.out.println("-------------");
        // bulk operation methods
        //addAll
        //containsAll
        //removeAll
        //retainAll
        //they are all required to entry a collection type inside the paranthesis of the method
        //list is a collection type, so we can put list inside paranthesis
        //but we gotta call asList method from Arrays utility class to enter our Integers as a list (collection type)

        ArrayList<Integer>numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));









    }
}
