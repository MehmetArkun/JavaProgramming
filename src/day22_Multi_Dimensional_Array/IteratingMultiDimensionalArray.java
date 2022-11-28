package day22_Multi_Dimensional_Array;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        int [] [] arr2D= { {1,2,3} , {4,5,6,7} , {8,9,10,11,12} };

        for (int i = 0; i < arr2D.length; i++) {
            //i represents index numbers of single dimensional arrays(not elements inside)
            //System.out.println(Arrays.toString(arr2D[i]));

            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]);
            }

            System.out.println();//ic loop her bittiginde bir tane bosa salsin diye

        }

        System.out.println("---------------------------------------");



    }
}

