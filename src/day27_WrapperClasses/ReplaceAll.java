package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,6,7,8,9,6};
        array = replaceAll(array, 6,5);
        System.out.println(Arrays.toString(array));
    }
    public static int [] replaceAll (int[]array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }

        return array;

    }
}
