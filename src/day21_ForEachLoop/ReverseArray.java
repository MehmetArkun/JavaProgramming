package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int [] numbers = {10, 20, 30, 40};
        //                 0   1   2   3

        int [] reversed = new int[numbers.length];

        /*        i             j
        reversed [0] = numbers [3]
        reversed [1] = numbers [2]
        reversed [2] = numbers [1]
        reversed [3] = numbers [0]
         */

        for (int i = 0, j= numbers.length-1; i < numbers.length; i++, j--) {
        reversed[i]=numbers[j];
        }

        System.out.println(Arrays.toString(reversed));




    }
}
