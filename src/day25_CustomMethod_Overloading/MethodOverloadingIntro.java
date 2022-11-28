package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

        int[] intArray = {5, 6, 0, -1, 3, 4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);
        //even though method name is same, methods are different desgined for each array type.

        System.out.println("----------------------------");

        sumOfNumbers(10, 20, 30, 40);

        System.out.println("----------------------------");

        sumOfNumbers(5.5, 6.5, 7.6, 7.6);


    }

    public static int sumOfNumbers(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    public static int sumOfNumbers(int number1, int number2, int number3) {

        int sum = number1 + number2 + number3;
        return number1 + number2 + number3;

    }

    public static int sumOfNumbers(int number1, int number2, int number3, int number4) {
        return sumOfNumbers(number1, number2)+number3+number4;
    }

    public static double sumOfNumbers(double number1, double number2, double number3, double number4) {

        return number1 + number2 + number3 + number4;

    }

}
