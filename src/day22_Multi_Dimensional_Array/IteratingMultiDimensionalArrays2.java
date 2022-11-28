package day22_Multi_Dimensional_Array;

public class IteratingMultiDimensionalArrays2 {

    public static void main(String[] args) {

        int [] [] arr2D= { {1,2,3} , {4,5,6,7, 8} , {9,10,11,12} };



        for (int i = arr2D.length - 1; i >= 0; i--) {
            //i:index numbers of single dim arrays inside 2d array

            for (int j = 0; j < arr2D[i].length; j++) {
                //j:index numbers of elements of the single dim arrays inside 2d array
                System.out.print(arr2D[i][j] + " ");

            }
            System.out.println();

        }

        System.out.println("-----------");

        for (int i = 0; i < arr2D.length; i++) {

            for (int j = arr2D[i].length-1; j >= 0; j--){
                System.out.print(arr2D[i][j] + " ");
            }

            System.out.println();

        }

        System.out.println("-------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {

            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) {

                System.out.print(arr2D[i][i1] + " ");

            }
            System.out.println();


        }




    }
}

/*
 9 10 11 12 13
 4 5  6  7  8
 1 2  3
 */
