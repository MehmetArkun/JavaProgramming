package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6}; // I wanna add 7
        char [] chars = {'A', 'B', 'C', 'D'}; // I wanna add 'E'
        String [] names = {"Ahmet", "Oleksandr", "Sinem", "Cihad"}; // I wanna add "Layan"

        numbers = addElements(numbers,7);
        System.out.println(Arrays.toString(numbers));
        chars = addElements(chars, 'E');
        System.out.println(Arrays.toString(chars));
        names = addElements(names, "Layan");
        System.out.println(Arrays.toString(names));

    }

    public static int[] addElements (int [] array, int element){

        int [] result = new int[array.length+1];

        int i = 0;

        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;


    }

    public static double[] addElements (double [] array, double element){
        double [] result = new double[array.length+1];

        int i = 0;

        for (double each : array){
            result[i++]=each;
        }

        result[i]=element;
        return result;


    }

    public static String [] addElements (String [] array, String element){

        String [] result = new String[array.length+1];

        int i = 0;
        for (String each : array) {
            result[i++]=each;
        }

        result[i]=element;
        return result;

    }

    public static char [] addElements (char[] array, char element){
        char[]result = new char [array.length+1];
        int i = 0;
        for (char each : array) {
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }
}
