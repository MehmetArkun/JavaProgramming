package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerIntro {

    public static void main(String[] args) {
        //represents a function which takes one argument (any object) and does not return a value

        Consumer <String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println("s.charAt(i) = " + s.charAt(i));
            }
        };

        printEach.accept("Java");

        System.out.println("----------------------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,34,5,6,7,8,9));

        /*
        for (Integer each : list2) {
            if (each%2==0){
                System.out.println(each);
            }
        }

         */

        list2.forEach(p -> {if(p %2==0) System.out.println(p);});
        //this method takes a consumer fucntional interface

        System.out.println("-----------------------------------------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah", "Jilili Jiwuer", "Ali Ismayilov"));

        /*


        for (String eachName : employees) {
            System.out.println(eachName.substring(0,1) + "." + eachName.substring(eachName.indexOf(" "), eachName.indexOf(" ")+2));
        }

 */

        employees.forEach(s-> System.out.println(s.charAt(0)+"."+s.charAt(s.lastIndexOf(" ")+1)));








    }
}
