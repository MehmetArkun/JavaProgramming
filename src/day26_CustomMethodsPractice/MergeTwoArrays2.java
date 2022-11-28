package day26_CustomMethodsPractice;



import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {

    public static void main(String[] args) {

        int [] array1={1,2,3};
        int [] array2={4,5,6,7,8,9};

        int [] mergedArray = mergeArrays2(array1,array2);
        System.out.println(Arrays.toString(mergedArray));

        System.out.println("--------------------------");

        String [] a1 = {"A", "B", "C"};
        String [] a2 = {"A", "B", "C"};

        String [] a3 = ArraysUtility.mergeArrays2(a1,a2);
        System.out.println(Arrays.toString(a3));


    }



    //merges the given two arrays and returns the new array
    public static int[] mergeArrays2(int[] array1, int[] array2) {
        int[] mergedArray = {};

        for (int each : array1) {
            mergedArray = ArraysUtility.addElements(mergedArray,each);
        }

        for (int each : array2) {
            mergedArray = ArraysUtility.addElements(mergedArray,each);
        }
        return mergedArray;





    }
}
