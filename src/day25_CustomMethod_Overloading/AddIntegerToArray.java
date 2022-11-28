package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddIntegerToArray {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4};
        arr = addInteger(arr, 5);
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------");

        double[]arr2={1.5, 2.5, 3.5, 4.5};
        arr2 =  addDouble(arr2, 5.5);
        System.out.println(Arrays.toString(arr2));
        System.out.println("-------------------");

        String [] arr3 ={"Tatiana", "Oleksandr", "Cassandra", "Ali"};
        arr3 = addString(arr3, "Cilgin Bedis");
        System.out.println(Arrays.toString(arr3));
        System.out.println("----------------------");

        char[] arr4 = {'1', 'b', 't', '6'};
        arr4 = addChar(arr4, '@');
        System.out.println(Arrays.toString(arr4));
        System.out.println("----------------------");


    }


    //    //1. create a return method called addInteger
    //    that can add an Integer after the  last index of an integer array
    public static int[] addInteger(int [] array, int element){

        int [] result = new int[array.length+1];

        int i = 0;

        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;


    }


    //    //2. create a return method called addDouble
    //    that can add a Double after the  last index of an double array
    public static double[] addDouble (double [] array, double element){
        double [] result = new double[array.length+1];

        int i = 0;

        for (double each : array){
            result[i++]=each;
        }

        result[i]=element;
        return result;


    }


    //3. create a return method called addString
    // that can add a String after the last index of a String array

    public static String [] addString (String [] array, String element){

        String [] result = new String[array.length+1];

        int i = 0;
        for (String each : array) {
            result[i++]=each;
        }

        result[i]=element;
        return result;

    }

    //    //4. create a return method called addChar
    //    that can add a char after last index of a char array

    public static char [] addChar (char[] array, char element){
        char[]result = new char [array.length+1];
        int i = 0;
        for (char each : array) {
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }


}
