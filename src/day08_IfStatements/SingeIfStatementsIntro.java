package day08_IfStatements;

import java.sql.SQLOutput;

public class SingeIfStatementsIntro {

    public static void main(String[] args) {

        // if statements used for creaeting conditional statements
        // when we have a code fragment to be created in accordance with certain conditions
        // if any codefragment's execution depends on certain condiitons, then we use if statement

        int number = 100;

        // 300 is either an odd number or even number
        //there are 2 possiblities when it comes to outcomes
        //so, we can use multiple single if statements

        boolean evenNumber = number % 2 == 0; //true
        boolean oddNumber = !evenNumber; //false


        if (evenNumber) { //true

            System.out.println(number + " is even number");

            //if the condition in boolean is true, then print statement will work and execute
            // only true boolean result will be executed

        }

        if (oddNumber) {//false

            System.out.println(oddNumber + " is even number");
            // this print statement wont be exceuted since oddNumber variable is not true


        }


        System.out.println("---------------------------------");

        int n = 200;

        //postiive
        if (n > 0) {// if the n is greater than zero, then it's positive and this statement will be printed out
            System.out.println(n + " is positive");
        }


        //negative
        if (n < 0) {//if the n is smaller than zero, then it's negative and this statement will be printed out
            System.out.println(n + " is negative");

        }

        //zero
        if (n == 0) {

            System.out.println(n + " is zero");



        }

    }
}