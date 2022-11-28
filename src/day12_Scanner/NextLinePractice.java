package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter age kindly");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Please enter your name kindly");
        String name = input.nextLine();

        System.out.println("Please enter your GPA kindly");
        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("Please enter your school name kindly");
        String schoolName = input.nextLine();


        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("schoolName = " + schoolName);
        System.out.println("gpa = " + gpa);


        input.close();


    }
}

/*
ask the user to enter age (nextInt())
ask user enter full name nextLine


 */