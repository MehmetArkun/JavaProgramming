package day49_Collections_Continue;

import java.util.*;

public class SetClassPractice {

    public static void main(String[] args) {

        // in this page we made so many conversions from set to list and arrays

        String [] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon",
        "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper Towels"};

        //Set<String> set1 = new HashSet<>(Arrays.asList(arr));

        //System.out.println("set1 = " + set1);
        //duplicates will be eradicated as HashSet does not accept duplicates
        //arr = set1.toArray(new String [0]);

        arr = new HashSet<>(Arrays.asList(arr)).toArray(new String [0]);

        System.out.println(Arrays.toString(arr));


        System.out.println("-----------------------------");

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30 ,20, 10));
        // we do not want any duplicates
        // I want to keep the same order. If I use HashList, order will be random and can change.
        // if I use LinkedHashList, order will be preserved. For instance, 1000 will be the first, and 10 will be last

        list = new ArrayList<>( new LinkedHashSet<>(list) );

        System.out.println("-------------------------------------");

        String [] array = {"A", "A", "B", "C"};

        Set<String> s = new LinkedHashSet<>();
        s.addAll(Arrays.asList(array));
        //addAll methodun parametresi collection type alir. list colelction'dir.
        // Arrays.asList kullanarak array'i list olarak iceriye koyuyoruz constructor'in.
        s.addAll(Arrays.asList("E", "F", "G"));

        System.out.println("------------------------------------------");


        /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
            return the fifth element after removing the duplicates
                        Do not change the order of the elements
         */


        Integer[] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

       nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer [0]);//0 is the min size for data structures
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[5]);

        System.out.println("----------------------------------");
        
        
        String str = "eeeeeaaaabbbbccccdddeeeee";
        String result = ""; // e5a4b4c4d3 // bu sonucu elde etmemiz lazim

        
        //new LinkedHashSet<>(Arrays.asList(str.split("") )).for --> bu adimlari uyguladik asagiya for each loopumuz geldi

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count = Collections.frequency(Arrays.asList(str.split("")), each);
            result += each + count;
        }

        System.out.println("------------------------");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Brenna", "Shay", "Ahmet"));

        System.out.println(names.toArray(new String [0][2])); // we converted set to array here, and then got the 2nd index element

        System.out.println(new ArrayList<>(names).get(4)); // we converted set to arraylist here and got 4th index element

        for (String eachElementOfSet: names) {
            System.out.println(eachElementOfSet);
        }

        



    }
}
