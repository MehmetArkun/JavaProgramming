package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int [] array = {1,2,34,23,4,42,5,234,123,4,13,1,1,1,1,1,1,2,2,2,2};

        array = removeDuplicates(array);
        System.out.println(Arrays.toString(array));


    }

    public static int [] removeDuplicates (int[]array){

        int [] array2 = {};

        for (int each : array) {

            if(!ArraysUtility.contains(array2,each)){
                array2=ArraysUtility.addElements(array2,each);
            }
        }

        return array2;


    }

}
