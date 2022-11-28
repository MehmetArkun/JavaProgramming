package day15_ForLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {
        System.out.println("write your first name");
        String firstName = new Scanner (System.in).next();
        System.out.println("write your second name");
        String lastName = new Scanner (System.in).next();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        //firstName = (" " + firstName.charAt(0) ).toUpperCase() + firstName.substring(1).toLowerCase();
//charAt char geri verdigi icin string metodu kullanamiyoruz, " icinde bosluk ile concatenate edersek stringe donusur
        // bu da ayri bir cozum




    }
}

/*
write a program that asks user to enter first and last names,
then prints the full name in regular format
input: first = "cyDEO"
        last = "SCHOOL"
output: Cydeo School
 */