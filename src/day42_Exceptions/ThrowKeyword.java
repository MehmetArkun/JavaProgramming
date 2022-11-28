package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        //used for creating exception
        //when you wanna termiante the program for instance
        //termianating program could be a lot easier for the reader to read the code and understand
        //so throw keyword is used manual creation of exception

        System.out.println("Enter your age:");

        int age = new Scanner(System.in).nextInt();

        /*
        if(age<0){

            System.out.println("Invalid age");
            System.exit(1);
        }//this is how we exit the program wtihin the line of the condition
        //instead of doing this, we can also create an exception for this occasion
        */

        if ( age < 0 ){
            throw new InputMismatchException("age can not be negative" + age);
            //we can also write print statementinside because inputmatchexception class is child class of runtime
            //class, which is actually parent class. parent class can share methods. it has that method of printing
            //we are basically giving the string element here for the constructor.
        }

        if ( age > 21 ){
            System.out.println("You're eligible");
        }else {
            throw new RuntimeException("You must be at least 21 years old");
        }



    }
}
