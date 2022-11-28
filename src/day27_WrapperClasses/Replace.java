package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {

        String [] arr2 = {"Java", "Python", "C++", "Ruby"};

        arr2 = replace(arr2,3, "C#");
        System.out.println(Arrays.toString(arr2));

    }

    public static int [] replace (int[] array, int index, int newElement){
        if (index > array.length-1 || index<0){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array [index] = newElement;
        return array;

    }

    public static String [] replace (String[] array, int index, String newElement){
        if (index > array.length-1 || index<0){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array [index] = newElement;
        return array;

    }

    public static char [] replace (char[] array, int index, char newElement){
        if (index > array.length-1 || index<0){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array [index] = newElement;
        return array;

    }

    public static double [] replace (double[] array, int index, double newElement){
        if (index > array.length-1 || index<0){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array [index] = newElement;
        return array;

    }




}
