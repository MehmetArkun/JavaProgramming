package day17_While_DoWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginBranching {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int a = 1; a<=3; a++){//burada olumsuzlugun programini yazdik aslinda

            System.out.println("Please enter your username");
            String username = input.next();

            System.out.println("Please enter your password");
            String password = input.next();

            if (username.equals("Cydeo") && password.equals("Cydeo123")){
                System.out.println("Logged-in");
                break;//tek exception burasi bu olumsuzlukta, olumluluga refere ediyor burasi
            }

            System.out.println("Invalid credientials");//burasi i boyunca gelecek
            if (a==3){
                System.out.println("Your account is locked");
            }

            input.close();


        }





    }
}

/*
        you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
        username: Cydeo
        password: Cydeo123
        Ask the user to enter their credentials.
        If credentials are matched, your program should print "Logged in."
        If the credentials are not matched, the program should allow the user to have three attempts
        to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
        */