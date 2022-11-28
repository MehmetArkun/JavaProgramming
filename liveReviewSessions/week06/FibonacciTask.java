package week06;

import java.util.Scanner;

public class FibonacciTask {

    public static void main(String[] args) {

        /*
        public static void main(String[] args) {
       int f1=0;
       int f2=1;
       int f3=0;

        for (int i = 2; i < 6; i++) {
            f3=f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
        }
    }
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the term number for Fibonacci Series ? : ");

        int n = scanner.nextInt();  // 6
        int num1 = 0;
        int num2 = 1;
        int sum ;

        // Variables are containers that hod value

        String series = ""+num1+" "+num2+" ";

        for (int i = 2; i<=n ; i++){   // if n=6, it will do 5 times iteration
            sum = num1+num2;
            series +=sum+" ";
            num1 = num2;
            num2 = sum;
        }
        System.out.println("series = " + series);
        System.out.println("final number in the squence = " + num2);




    }
}

/*
        noun: Fibonacci sequence
a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.

The simplest is the series 1, 1, 2, 3, 5, 8, etc.

Write a program to print
         Fibonacci series of n terms
         where n is declared by user :
         0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......

        This is a example of Fibonacci series of 6 terms

        term number        0    1    2    3    4    5    6  7
        Actual value       0,   1,   1,   2,   3,   5,   8  13

         */