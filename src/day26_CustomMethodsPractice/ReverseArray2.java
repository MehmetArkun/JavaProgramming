package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class ReverseArray2 {

    public static void main(String[] args) {

    }

    public static int [] reverseArray2 (int [] array){

        int [] result ={};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElements(result, array[i]);
        }
        return result;

    }

}
