package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        int [] result = reverseArray(arr);
        System.out.println(Arrays.toString(result));

    }


    public static int [] reverseArray (int[] array){

        int [] reversedArray = new int[array.length];
        int j = 0;
        for (int i = array.length-1; i >=0 ; i--) {
            reversedArray[j++]=array[i];
        }
        return reversedArray;

    }
}


