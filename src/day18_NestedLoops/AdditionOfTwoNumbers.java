package day18_NestedLoops;

import java.util.Scanner;

public class AdditionOfTwoNumbers {

    public static void main(String[] args) {

        while (true) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter first number");
            int num1 = scan.nextInt();

            System.out.println("Enter second number");
            int num2 = scan.nextInt();

            System.out.println("Addition: " + (num2 + num1));

            System.out.println("Would you like to continue");
            String a = scan.next().toLowerCase();

            while( !(a.equals("yes") || a.equals("no")) ){
                System.out.println("Invalid Entry, Please re-enter");
                a=scan.next().toLowerCase();

            }

            if (a.equals("no")) {
                break;
            }


        }
    }
}
