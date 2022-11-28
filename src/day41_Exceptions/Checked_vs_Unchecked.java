package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.File;
import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //UNCHECKED EXAMPLE

        int a = 10;
        int b = 0;

        //System.out.println( a / b );
        //while writing code, it is not checking if it is an exception
        //when we run it, it gives arithmetic exception during the run time

        //System.out.println("Wooden Spoon");
        //this code is not gonna be printed as we will have an "exit code 1" after runtime exception, which
        //actually exits the code

        System.out.println("---------------------------------------------------------------------------");

        char [] characters = {'A' , 'B' , 'C'};
//                             0     1     2
        //System.out.println( characters[99] );
        //compiler does not know that there is no 99th index inside this array
        //it will only check during run time
        //everysingle exception is an object and they come from a class.
        //in the console, after running, it will say: java.lang.ArrayIndexOutOfException
        //ArrayIndexOutOfException is a class name coming from java.lang package
        //java.lang package is implicitly imported
        //Index 99 out of bounds for length is the message of the exception


        System.out.println("-------------------------------------------");

        Student student = null;
        //this null keyword does not refer to anything, student object is not created yet
        //since the object is not creataed, we can not use an isntance from that particular class
        //because instance variables or methods come via object

        //System.out.println( student.getName() );
        //since there is no object, we are not gonna be able to get the name as the name variable is instance
        //but compile can not check it during compoile time

        System.out.println("=====================================");

        String str = "Wooden Spoon";
        //str = null;
        //wooden spoon object is collected by garbage collector as we assigned str to a null;
        System.out.println(str.toUpperCase());
        //since we dont have anything, we can not use string method of upper ccase
        //but compile can not check it
        //in order to be a object, it should not equal to null

        System.out.println("---------------------------------------");


        //CHECKED EXCEPTION EXAMPLES

        System.out.println("Hello");

        //Thread.sleep(3000);
        //I use sleep method from Thread class which allows me to stop the code for a particular time
        //it basically acts as a break between two codes
        //here for instance we create a break between hello and cydeo via milicseconds
        //this error is not syntax error
        //compile is able to check
        //this kind of exceptions require immediate attention
        //they need to be handled
        System.out.println("Cydeo");

        System.out.println("----------------------------------------");

        //FileInputStream file = new FileInputStream("name of the file");
        //compile is able to check it is an exception
        //if you hower your mouse on the error, you can see the explanation
        //if it is unhandled, you prog is gonna crash
        //it is easier to handle compared to unchecked ones as it gives you the idea to as to how to handle it
        //it gives you the info as to which class gotta be used to handle the exception



















    }
}
