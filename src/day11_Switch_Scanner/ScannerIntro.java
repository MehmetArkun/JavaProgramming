package day11_Switch_Scanner;

import java.util.Scanner; //this is how we import classes that are outside of this package

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);


        System.out.println("Enter an integer: ");
        int num1 = input.nextInt();

        System.out.println("Enter a decimal");
        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication = " + (num1 * num2));

        input.close(); //scanner is terminated with this closing method


    }
}