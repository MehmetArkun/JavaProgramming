package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        //bulk opeartions = argument must be collection type
        //addAll(Collection Type): // we can use as list method to convert array of values into list which is a collection type
        //removeAll(CollectionType): // removes all the matching elements from the list
        //retainall(CollectionType): // removes all the un-matchin elements from the list
        //containsAll(CollectionType): // checks if elements are inside the list

        ArrayList<Integer>list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));
        list.retainAll(Arrays.asList(1,2));

        System.out.println("=============");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET", "Developer","QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitles);

        System.out.println("==================");

        ArrayList<Integer> nums = new ArrayList <>();
        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        boolean r1 = nums.contains(10);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        boolean r3 = nums.containsAll(Arrays.asList(2,5,10));

        System.out.println("r3 = " + r3);
        System.out.println("r2 = " + r2);
        System.out.println("r1 = " + r1);

        System.out.println("------------------------------");

        String [] names = {"Josh" , "Jack" , "Daniel" , "Shay" , "Brenna"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        //we put names array inside constructor of arraylist but with the method that converts it into list
        //but if you have a primitive array, you can not use this method
        //for instance you can not use this method to put integer array inside array list

        // namesList.addAll(Arrays.asList(names));

        System.out.println(namesList);

        System.out.println("------------------");

        Integer [] arr = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list2 = new ArrayList <> (Arrays.asList(arr));
        //burada kullanabildik, cunku array primitive degil, wrapped.

        System.out.println("===========");

        int [] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));

        // list3 = convertArrayToArrayList(arr2);

        System.out.println(list3);

    }

    public static ArrayList<Integer> convertArrayToArrayList (int [] array){

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;

    }
}
