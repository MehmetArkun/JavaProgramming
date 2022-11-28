package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {

        int [] array = {3,5,6,7,8,8,500};
        int [] newArray = removeElements(array,1);
        System.out.println(Arrays.toString(newArray));

    }

    //returns a new array that contains new elements from another array where we remove an element
    public static int[] removeElements (int[]array, int indexNumber){

        if (indexNumber<0 || indexNumber> array.length-1){
            System.err.println("Invalid Index Number: " + indexNumber);
        }

        int [] newArray = new int[array.length-1];

        int j =0;//itearation for indexes
        for (int i = 0; i< array.length; i++) {
            if (i == indexNumber){
                continue;
            }
            newArray [j++]= array[i];
        }
        return newArray;

    }
}
