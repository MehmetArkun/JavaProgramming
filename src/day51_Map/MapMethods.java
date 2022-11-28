package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    /*
    methods:
         put(key, value) inserts the given key and value to map
         get(key, value) returns the value of the given key
         replace()
         remove(key,value) or remove(key)
         containsKey(key) bollean return ttrue if the given key is contained in the map
         containsValue(value) boolean return ttrue if the given value is contained in the map
         isEmpty() returns true if the size of the map is 0 zero
         equals(Map) to compare without worrying about memory allocation
         clear() clears everything removes all the pairs
         ****IMPORTAN METHODS ****
         keySet() returns all the keys as a set because set is the collection does not accept duplicates
         values() returns all the values as a collection of the map
         entrySet() returns all the entries of the map (Entry: key & value)
            getKey -> to be used with entry
            getValue -> to be used with entry
            setKey -> to be used with entry
            setValue -> to be used with entry

     */

    public static void main(String[] args) {

        //student name & score:

        Map <String, Integer> students = new HashMap<>();
        students.put("Aygun", 85);
        students.put("Maria", 86);
        students.put("Ali", 95);
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkan", 97);
        students.put("Andriy", 98);
        students.put("Ali", 85);
        students.put("Ali", 86);
        students.put("Ali", 87);

        System.out.println("students = " + students);
        System.out.println("students.size() = " + students.size());

        //display the score of Alex
        System.out.println(students.get("Alex"));

        //replace Ali's score to 90
        students.put("Ali", 90);

        boolean r1 = students.containsKey("Muhtar"); // false
        boolean r2 = students.containsValue(200); // false
        boolean r3 = students.containsValue(85); // true as Aygun's value is 85

        System.out.println("---------------");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map <String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println(map1==map2);//different objects
        System.out.println(map1.equals(map2));















    }
}
