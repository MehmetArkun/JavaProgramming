package day26_CustomMethodsPractice;

public class MergeTwoArrays {

    public static void main(String[] args) {

    }

    //merges the given two arrays and returns the new array
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];

        int i = 0;
        for (int each : array1) {
            mergedArray[i++]=each;
        }

        for (int each : array2) {
            mergedArray[i++]=each;
        }

        return mergedArray;



    }


}
