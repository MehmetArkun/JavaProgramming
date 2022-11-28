package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabcccdeeef";
        //we can use split method to create an array, so that we can use that array to create an array list

        String [] arr = str.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));//Arrays.asList(str.split(""))
        ArrayList<String> unique = new ArrayList<>();
        for (String each : list) {
            if (Collections.frequency(list, each)==1){
                unique.add(each);
            }
        }
        System.out.println(unique);

    }
}
