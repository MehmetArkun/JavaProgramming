package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerShortPractice3 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in); //enter scanner memory'de


        System.out.println("Enter Your Score");
        int score = input.nextInt();//85+Enter

        input.nextLine(); //simdi enter buraya gidecek


        System.out.println("Enter your full name");
        String name = input.nextLine();

        System.out.println("score = " + score);
        System.out.println("name = " + name);



    }
}
