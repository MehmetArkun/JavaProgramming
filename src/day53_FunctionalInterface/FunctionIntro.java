package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionIntro {

    public static void main(String[] args) {

        //represents a function which takes one argument (any object) and RETURN a value (any object)

        Function <int [] , List<Integer>> convertToList;
        convertToList = a -> {

            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int [] arr = {1,2,3,4,5,6,7,8,9,10};

       List<Integer> l = convertToList.apply(arr);

        System.out.println(l);

        System.out.println("-----------------------------------------------");

        Function<List<Integer>, int[]> convertToArray;
        convertToArray = a -> {

            int [] r = new int[a.size()];
            int i =0;
            for (Integer each : a) {
                r [i++] = each;
            }

            return r;

        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int[] array1 = convertToArray.apply(numbers);

        System.out.println("array1:" + Arrays.toString(array1));


    }
}
