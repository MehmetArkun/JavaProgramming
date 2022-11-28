package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class RemoveElements2 {

    public static void main(String[] args) {

    }

    //remove an element from the array
    public static int[] removeElements (int [] array, int index){
        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index Number: " + index);
        }
        int [] result ={};
        for (int i = 0; i < array.length; i++) {
            if(i!=index){
                ArraysUtility.addElements(result, array[i]);
            }
        }
        return result;
    }


}
