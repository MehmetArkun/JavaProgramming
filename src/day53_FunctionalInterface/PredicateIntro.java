package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateIntro {


    public static void main(String[] args) {

        //predicate:boolean
        //represents a function which takes one argument (any object) and returns boolean
        Predicate<String> isPalindrome = (p) -> {
            String reverse = "";
            for (int i = p.length()-1; i >=0 ; i--) {
                reverse+=p.charAt(i);
            }
            return reverse.equalsIgnoreCase(p);
        };

        boolean result1 = isPalindrome.test("Java");
        System.out.println("result1 = " + result1);

        System.out.println("----------------------------");

        java.util.function.Predicate<Integer> isEven = n -> n %2==0;

        System.out.println("-----------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,1,2,3));

        list.removeIf(isEven);

        System.out.println("-----------------------------------------------");

        List <String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));
        names.removeIf(isPalindrome);

        //remove-if methodu icine predicate condition aliyor.
        //zaten yukarida predicate condition olusturup onu assigne ettik bir rereference name'a


        }

    }
