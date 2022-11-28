package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();// valid age is between 1~120

        while(!(age>=1 && age<=120)){
            System.out.println("Invalid age. Please enter age again");
            age = scan.nextInt();
        //loop will continiue to execute as long as the boolean inside while loop is true
            //it needs to false
        }

        System.out.println("Are you a US citizen yes/no");
        String answer = scan.next();

        while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer. Please answer yes or no");
            answer = scan.next();
        }
        if (answer.equalsIgnoreCase("yes")&&age>=18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("you are not eligible to vote");
        }



    }
}
