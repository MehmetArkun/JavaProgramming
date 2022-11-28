package day50_Collections_Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "Radar", "Kayak", "Reviver", "Racecar", "madam"));
        //remove palindromes

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            String each = it.next();
            String reversed = "";
            for (int i = each.length()-1; i>=0; i--){
                reversed+=each.charAt(i);
            }
            if (each.equalsIgnoreCase(reversed)){
                it.remove();
            }

        }
        System.out.println("names = " + names);



    }
}
