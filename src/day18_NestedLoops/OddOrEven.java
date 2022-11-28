package day18_NestedLoops;

import java.util.Locale;
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd Number");
            }

            System.out.println("Would you like to continue?");
            String answer = input.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Please re-enter, would you like to continue?");
            }

            if (answer.equals("no")){
                break;
            }


        }
    }
}

/*
2. Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"
        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing
                If user enters invalid answer, repeat the previous steps
 */