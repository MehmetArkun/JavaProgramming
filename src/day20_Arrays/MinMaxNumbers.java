package day20_Arrays;

import java.util.Scanner;

public class MinMaxNumbers {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max = numbers[i];
            }

        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){
                min = numbers[i];
            }

        }


        System.out.println("max= " + max);
        System.out.println("min= " + min);

        }





    }

/*
write a program that asks user to enter a number 10 times
1 store all user entered numbers in an array
2 find the max
3 find the min
 */