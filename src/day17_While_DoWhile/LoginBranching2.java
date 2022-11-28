package day17_While_DoWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginBranching2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String u = input.next();

        System.out.println("enter password");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("Logged-in");
        } else {

            for (int i = 1; i < 4; i++) {

                System.out.println("incorrect username or password");
                System.out.println("enter your username");
                u = input.next();

                System.out.println("enter your password");
                p = input.next();

                if (u.equals("Cydeo") && p.equals("Cydeo123")) {

                    System.out.println("Logged-in");
                    break;
                }

            }

            input.close();

            System.out.println("account locked");


        }
    }
}
