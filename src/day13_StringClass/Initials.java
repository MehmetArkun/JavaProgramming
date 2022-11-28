package day13_StringClass;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initials = f +"." + l; // one empty string is given here for concatenation
        System.out.println(initials);



    }
}
