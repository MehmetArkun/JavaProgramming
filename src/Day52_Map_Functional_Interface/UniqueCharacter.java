package Day52_Map_Functional_Interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacter {

    public static void main(String[] args) {

        /*
1. Write a program that can find the unique characters from a String
			Ex:
					str = "aabcccdeeeef";
			output:
					{b=1, d=1, f=1}
 */



        String str = "aabcccdeeeef";

        String [] arr = str.split("");


        Map<String, Integer> map = new LinkedHashMap<>();

        for (String eachArrayElement : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr),eachArrayElement);
            if (frequency==1){
                map.put(eachArrayElement, frequency);

            }
        }

        System.out.println("map = " + map);






    }
}
