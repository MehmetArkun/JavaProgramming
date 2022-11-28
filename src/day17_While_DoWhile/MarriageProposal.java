package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer = input.next();

        while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer please say yes or no");
            answer=input.next();
        }

        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Congrats");
        }else {
            System.out.println("that's what I thought well done");
        }



    }
}

/*
write a program asking user will you marry me
if answer is yes print congrats
if answer is neuther yes or no say invalid aswer and repeat until user enters yes or no
 */
