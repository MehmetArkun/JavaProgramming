package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number");
        int num2 = scan.nextInt();

        //+,-(acceptable operators for this example) we do not know how many times user will enter wrong math operators

        System.out.println("Enter a math operator");
        char ch = scan.next().charAt(0); // this is how we get char at scanner

        /*
        if (!(ch=='+' || ch=='-')){
         *
            System.out.println("Invalid entry, please re-enter");
            ch = scan.next().charAt(0);
        }
        we gotta use here while instead of if since it will repeat only one time with if
        */

        while(!(ch=='+' || ch=='-')){

            System.out.println("Invalid entry, please re-enter");
            ch = scan.next().charAt(0);
        }

        System.out.println((ch=='+')? num1+num2 : num1-num2);

    }
}
