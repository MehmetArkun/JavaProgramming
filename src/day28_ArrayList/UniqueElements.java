package day28_ArrayList;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");

        System.out.println(list);

        //we are going to add unique elements to another array list named unique

        ArrayList<String> unique = new ArrayList<>();

        for (String each : list) {
            if (list.indexOf(each) == list.lastIndexOf(each)){
                unique.add(each);
            }
        }
        System.out.println(unique);

        System.out.println("----------------------");







    }
}
