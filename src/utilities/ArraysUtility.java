package utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {


    }

    //print each integer of an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    //print each double of a double array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    //print each String of a String array in separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    //print each char of a char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    //returns the maximum number for integer array
    public static int max(int[] array) {
        int maxNumber = 0;
        for (int each : array) {
            if (each > maxNumber) {
                maxNumber = each;
            }
        }
        return maxNumber;

        /*
        veya soyle de yapabilirsin

        Arrays.sort(array)
        return array[numbers.length-1] return array degil, int number burada,
        cunku array icinden bir index return ediyoruz
         */


    }

    //returns the maximum number for double array
    public static double max(double[] array) {
        double maxNumber = 0;
        for (double each : array) {
            if (each > maxNumber) {
                maxNumber = each;
            }
        }
        return maxNumber;

    }

    //returns the minimum number for integer array
    public static int min(int[] array) {
        Arrays.sort(array);
        return array[0];

    }

    //returns the minimum number for double array
    public static double min(double[] array) {
        Arrays.sort(array);
        return array[0];

    }

    //returns true if a particular int array contains given integer
    public static boolean contains(int[] array, int number) {
        boolean result = false;

        for (int each : array) {
            if (each == number) {
                result = true;
            }
        }
        return result;
    }

    //returns true if a particular double array contains given double
    public static boolean contains(double[] array, double number) {
        boolean result = false;

        for (double each : array) {
            if (each == number) {
                result = true;
            }
        }
        return result;
    }

    //returns true if a particular char array contains given char
    public static boolean contains(char[] array, char ch) {
        boolean result = false;

        for (char each : array) {
            if (each == ch) {
                result = true;
            }
        }
        return result;
    }

    //returns true if a particular String array contains given String
    public static boolean contains(String[] array, String str) {
        boolean result = false;

        for (String each : array) {
            if (each.equalsIgnoreCase(str)) {
                result = true;
            }
        }
        return result;
    }

    //add int elements to int array
    public static int[] addElements(int[] array, int element) {

        int[] result = new int[array.length + 1];

        int i = 0;

        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;


    }

    //add double elements to double array
    public static double[] addElements(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;

        for (double each : array) {
            result[i++] = each;
        }

        result[i] = element;
        return result;


    }

    //add String elements to String array
    public static String[] addElements(String[] array, String element) {

        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }

        result[i] = element;
        return result;

    }

    //add char elements to char array
    public static char[] addElements(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //returns frequency of int element from the given int array
    public static int frequencyOfElement(int[] array, int element) {

        int frequency = 0;

        for (int each : array) {
            if (each == element) {
                frequency++;
            }
        }

        return frequency;


    }

    //returns frequency of double element from the given double array
    public static int frequencyOfElement(double[] array, double element) {

        int frequency = 0;

        for (double each : array) {
            if (each == element) {
                frequency++;
            }
        }

        return frequency;


    }

    //returns frequency of String element from the given String array
    public static int frequencyOfElement(String[] array, String element) {

        int frequency = 0;

        for (String each : array) {
            if (each == element) {
                frequency++;
            }
        }

        return frequency;


    }

    //returns frequency of char element from the given char array
    public static int frequencyOfElement(char[] array, char element) {

        int frequency = 0;

        for (char each : array) {
            if (each == element) {
                frequency++;
            }
        }

        return frequency;


    }

    //returns the unique element from a given element via another array
    public static int[] uniqueElements(int[] array) {

        int[] result = {};

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElements(result, each);
            }
        }

        return result;

    }

    //returns the unique element from a given element via another array
    public static String[] uniqueElements(String[] array) {

        String[] result = {};

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElements(result, each);
            }
        }

        return result;

    }

    //returns the unique element from a given element via another array
    public static double[] uniqueElements(double[] array) {

        double[] result = {};

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElements(result, each);
            }
        }

        return result;

    }

    //returns the unique element from a given element via another array
    public static char[] uniqueElements(char[] array) {

        char[] result = {};

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElements(result, each);
            }
        }

        return result;

    }

    //returns a new array that contains new elements from another array where we remove an element
    public static int[] removeElements(int[] array, int indexNumber) {

        if (indexNumber < 0 || indexNumber > array.length - 1) {
            System.err.println("Invalid Index Number: " + indexNumber);
        }

        int[] newArray = new int[array.length - 1];

        int j = 0;//itearation for indexes
        for (int i = 0; i < array.length; i++) {
            if (i == indexNumber) {
                continue;
            }
            newArray[j++] = array[i];
        }
        return newArray;

    }

    //returns a new array that contains new elements from another array where we remove an element
    public static double[] removeElements(double[] array, int indexNumber) {

        if (indexNumber < 0 || indexNumber > array.length - 1) {
            System.err.println("Invalid Index Number: " + indexNumber);
        }

        double[] newArray = new double[array.length - 1];

        int j = 0;//itearation for indexes
        for (int i = 0; i < array.length; i++) {
            if (i == indexNumber) {
                continue;
            }
            newArray[j++] = array[i];
        }
        return newArray;

    }

    //returns a new array that contains new elements from another array where we remove an element
    public static String[] removeElements(String[] array, int indexNumber) {

        if (indexNumber < 0 || indexNumber > array.length - 1) {
            System.err.println("Invalid Index Number: " + indexNumber);
        }

        String[] newArray = new String[array.length - 1];

        int j = 0;//itearation for indexes
        for (int i = 0; i < array.length; i++) {
            if (i == indexNumber) {
                continue;
            }
            newArray[j++] = array[i];
        }
        return newArray;

    }

    //returns a new array that contains new elements from another array where we remove an element
    public static char[] removeElements(char[] array, int indexNumber) {

        if (indexNumber < 0 || indexNumber > array.length - 1) {
            System.err.println("Invalid Index Number: " + indexNumber);
        }

        char[] newArray = new char[array.length - 1];

        int j = 0;//itearation for indexes
        for (int i = 0; i < array.length; i++) {
            if (i == indexNumber) {
                continue;
            }
            newArray[j++] = array[i];
        }
        return newArray;

    }

    //merges the given two arrays and returns the new array
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];

        int i = 0;
        for (int each : array1) {
            mergedArray[i++] = each;
        }

        for (int each : array2) {
            mergedArray[i++] = each;
        }

        return mergedArray;


    }

    //merges the given two arrays and returns the new array
    public static int[] mergeArrays2(int[] array1, int[] array2) {
        int[] mergedArray = {};

        for (int each : array1) {
            mergedArray = addElements(mergedArray, each);
        }

        for (int each : array2) {
            mergedArray = addElements(mergedArray, each);
        }
        return mergedArray;


    }

    //merges the given two arrays and returns the new array
    public static double[] mergeArrays(double[] array1, double[] array2) {
        double[] mergedArray = new double[array1.length + array2.length];

        int i = 0;
        for (double each : array1) {
            mergedArray[i++] = each;
        }

        for (double each : array2) {
            mergedArray[i++] = each;
        }

        return mergedArray;


    }

    //merges the given two arrays and returns the new array
    public static double[] mergeArrays2(double[] array1, double[] array2) {
        double[] mergedArray = {};

        for (double each : array1) {
            mergedArray = addElements(mergedArray, each);
        }

        for (double each : array2) {
            mergedArray = addElements(mergedArray, each);
        }
        return mergedArray;


    }

    //merges the given two arrays and returns the new array
    public static String[] mergeArrays(String[] array1, String[] array2) {
        String[] mergedArray = new String[array1.length + array2.length];

        int i = 0;
        for (String each : array1) {
            mergedArray[i++] = each;
        }

        for (String each : array2) {
            mergedArray[i++] = each;
        }

        return mergedArray;


    }

    //merges the given two arrays and returns the new array
    public static String[] mergeArrays2(String[] array1, String[] array2) {
        String[] mergedArray = {};

        for (String each : array1) {
            mergedArray = addElements(mergedArray, each);
        }

        for (String each : array2) {
            mergedArray = addElements(mergedArray, each);
        }
        return mergedArray;


    }

    //merges the given two arrays and returns the new array
    public static char[] mergeArrays(char[] array1, char[] array2) {
        char[] mergedArray = new char[array1.length + array2.length];

        int i = 0;
        for (char each : array1) {
            mergedArray[i++] = each;
        }

        for (char each : array2) {
            mergedArray[i++] = each;
        }

        return mergedArray;


    }

    //merges the given two arrays and returns the new array
    public static char[] mergeArrays2(char[] array1, char[] array2) {
        char[] mergedArray = {};

        for (char each : array1) {
            mergedArray = addElements(mergedArray, each);
        }

        for (char each : array2) {
            mergedArray = addElements(mergedArray, each);
        }
        return mergedArray;


    }

    //returns a reversed version of the array
    public static int [] reverseArray (int[] array){

        int [] reversedArray = new int[array.length];
        int j = 0;
        for (int i = array.length-1; i >=0 ; i--) {
            reversedArray[j++]=array[i];
        }
        return reversedArray;

    }

    //returns a reversed version of the array
    public static int [] reverseArray2 (int [] array){

        int [] result ={};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElements(result, array[i]);
        }
        return result;

    }

    //returns a reversed version of the array
    public static String [] reverseArray (String[] array){

        String [] reversedArray = new String[array.length];
        int j = 0;
        for (int i = array.length-1; i >=0 ; i--) {
            reversedArray[j++]=array[i];
        }
        return reversedArray;

    }

    //returns a reversed version of the array
    public static String [] reverseArray2 (String [] array){

        String [] result ={};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElements(result, array[i]);
        }
        return result;

    }

    //returns a reversed version of the array
    public static double [] reverseArray (double[] array){

        double [] reversedArray = new double[array.length];
        int j = 0;
        for (int i = array.length-1; i >=0 ; i--) {
            reversedArray[j++]=array[i];
        }
        return reversedArray;

    }

    //returns a reversed version of the array
    public static double [] reverseArray2 (double [] array){

        double [] result ={};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElements(result, array[i]);
        }
        return result;

    }

    //returns a reversed version of the array
    public static char [] reverseArray (char[] array){

        char [] reversedArray = new char[array.length];
        int j = 0;
        for (int i = array.length-1; i >=0 ; i--) {
            reversedArray[j++]=array[i];
        }
        return reversedArray;

    }

    //returns a reversed version of the array
    public static char [] reverseArray2 (char [] array){

        char [] result ={};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElements(result, array[i]);
        }
        return result;

    }

    //replaces an element in int array
    public static int [] replace (int[] array, int index, int newElement){
        if (index > array.length-1 || index<0){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array [index] = newElement;
        return array;

    }

    //replaces an element in String array
    public static String [] replace (String[] array, int index, String newElement){
        if (index > array.length-1 || index<0){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array [index] = newElement;
        return array;

    }

    //replaces an element in char array
    public static char [] replace (char[] array, int index, char newElement){
        if (index > array.length-1 || index<0){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array [index] = newElement;
        return array;

    }

    //replaces an element in double array
    public static double [] replace (double[] array, int index, double newElement){
        if (index > array.length-1 || index<0){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array [index] = newElement;
        return array;

    }

    //replaces all the elements in double array
    public static int [] replaceAll (int[]array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }

        return array;

    }

    //replaces all the elements in double array
    public static double [] replaceAll (double[]array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }

        return array;

    }

    //replaces all the elements in double array
    public static char [] replaceAll (char[]array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }

        return array;

    }

    //replaces all the elements in double array
    public static String [] replaceAll (String[]array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }

        return array;

    }

    //removes duplicates from the array
    public static int [] removeDuplicates (int[]array){

        int [] array2 = {};

        for (int each : array) {

            if(!ArraysUtility.contains(array2,each)){
                array2=ArraysUtility.addElements(array2,each);
            }
        }

        return array2;


    }

    //removes duplicates from the array
    public static double [] removeDuplicates (double[]array){

        double [] array2 = {};

        for (double each : array) {

            if(!ArraysUtility.contains(array2,each)){
                array2=ArraysUtility.addElements(array2,each);
            }
        }

        return array2;


    }

    //removes duplicates from the array
    public static char [] removeDuplicates (char[]array){

        char [] array2 = {};

        for (char each : array) {

            if(!ArraysUtility.contains(array2,each)){
                array2=ArraysUtility.addElements(array2,each);
            }
        }

        return array2;


    }

    //removes duplicates from the array
    public static String [] removeDuplicates (String[]array){

        String [] array2 = {};

        for (String each : array) {

            if(!ArraysUtility.contains(array2,each)){
                array2=ArraysUtility.addElements(array2,each);
            }
        }

        return array2;


    }


}

