package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);

        System.out.println("--------------");

        double [] arr2 = {1.5, 2.5, 3.5, 4.5};
        ArraysUtility.printEachElement(arr2);

        System.out.println("---------------");

        char [] arr3 = {'A', 'B', 'C', 'D'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("---------------");

        String [] arr4 = {"David", "Elvira", "Ali", "Igor"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("---------------");

        int [] arr5 = {5, 8, 10, 100, 56};
        int maximumNumber = ArraysUtility.max(arr5);
        System.out.println(maximumNumber);

        System.out.println("----------------");

        int [] a1 = {1,2,3,4,5,6,7};
        boolean containOrNot = ArraysUtility.contains(a1,5);
        System.out.println(containOrNot);

    }
}
