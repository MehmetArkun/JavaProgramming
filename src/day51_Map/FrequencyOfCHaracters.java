package day51_Map;

import java.util.*;

public class FrequencyOfCHaracters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        //              bca
        //              235
        //           split()
        //           Collections.frequency()

        Map<String, Integer> result = new LinkedHashMap<>(); // to get the order in the requirement, we use Linked

        String [] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        for (String each : arr) { // each: characters of string
            result.put(each, Collections.frequency(Arrays.asList(arr),each));
            //you can also store Collections.frequency(Arrays.asList(arr),each) inside a variable
            //int frequency = Collections.frequency(Arrays.asList(arr),each);
        }
        System.out.println(result);









    }
}

/*
2. Write a program that can return the frequency of characters
        Not: MUST use map
        Ex: str = "bbcccaaaaa"
        output:
            {b=2, c=3, a=5}
 */
