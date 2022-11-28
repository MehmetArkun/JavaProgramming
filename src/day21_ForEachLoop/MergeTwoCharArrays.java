package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoCharArrays {

    public static void main(String[] args) {

        char [] ch1 = {'A', 'B', 'C'};
        char [] ch2 = {'D', 'E', 'F', 'G', 'H'};
        char [] ch3 = new char [ch1.length + ch2.length];

        int i = 0;

        for (char each : ch1) {
            ch3[i++] = each;

        }

        for (char each : ch2) {
            ch3[i++] = each;

        }

        System.out.println(Arrays.toString(ch3));


    }
}
