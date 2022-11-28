package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map <Integer, String> hashMap = new HashMap<>();
            //key     value
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(null, "Isabella");
        hashMap.put(6, "Ahmet");
        hashMap.put(7, "null");
        hashMap.put(8, "null");

        System.out.println("hashMap = " + hashMap);//order is not guaranteed. output will be different each time


        Map <Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(6, "Ahmet");
        linkedHashMap.put(7, "null");
        linkedHashMap.put(8, "null");
        System.out.println("linkedHashMap = " + linkedHashMap);


        Map <Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Isabella");
        System.out.println("treeMap = " + treeMap);
        //does not support null key

        Map <Integer, String> hashtable = new Hashtable<>();
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Isabella");
        System.out.println("hashtable = " + hashtable);
        //order is random








    }
}
