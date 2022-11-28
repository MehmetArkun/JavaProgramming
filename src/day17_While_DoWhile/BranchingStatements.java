package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {

    public static void main(String[] args) {

        //to force for loop to stop regardless of remaining checks for the condition

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i + "");

            if (i == 'F') {
                break; // exits the loop, therefore statement above wont be executed
                //if i equals to F of course.
            }
        }

        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");


        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter a number");
            int number = input.nextInt();

            if (number <0 ){
                break;

            }

        }
        input.close();






    }
}
