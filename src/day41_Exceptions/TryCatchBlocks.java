package day41_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test Started");
        //this is gonna be printed

        try {
            System.out.println(9 / 0);
            System.out.println("Try block");
            //it is not gonna run this block as unchecked exceptions are hadnled by catch block
        } catch (ArithmeticException e) {
            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception occured");
        }

        //System.out.println(9/0);
        //this is an unchecked exception

        System.out.println("Test Completed");
        //this is not gonna be printed

        //we gotta handle this exception so that we can have those prints as well
        System.out.println("----------------------------");

        System.out.println("Test 2 started");

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[200]);
            System.out.println("try block");

        } catch (RuntimeException e) {//this exception is gonna be assigned to this variable name of e
            //everytime exception occurs, exception obeject is created
            //when runtime exception happens, java will catch it and assigns to a variable in catch block
            //after it is successfully caught, we can use the variable and call some methods on the exception object
            //popular methods:
            //printStackTrace():prints a stack trace (full details) of the exception
            //getMessage():returns only brief description of exception
            //you gotta write the right kind of exception
            //since it is hard to determine which one it is
            //you can use the parent class of unchecked exceptions
            //which is RuntimeException actually
            //you can also give Exception class which is the parent of runtime as well
            //but in that case it will check checked classes as well
            //do not use throwable dont use Exception either
            System.out.println("catch block");
            System.out.println("ArrayIndexOutOfBoundsException was occurred");
            //e.printStackTrace();//it is gonna give all the details
            //after using this method it does not give exit code 1. it gives exit code 0
            System.out.println(e.getMessage()); //prints Index 200 out of bounds for length 5

        }

        //System.out.println( numbers [200] );

        System.out.println("Test 2 completed");

        System.out.println("-------------------------------------------------");

        System.out.println("Test 3 Started");


        try {
            System.out.println("Cydeo".substring(2, 0));

        } catch (RuntimeException e) {
            //e.printStackTrace();
        }

        System.out.println("Test 3 Completed");

        System.out.println("----------------------------------------------");

        System.out.println("Hello");

        try {
            Thread.sleep(3000);
            //there is also a shortcut. click on bulb and select surround with try and catch

        } catch (InterruptedException a) {
            a.printStackTrace();
        }

        System.out.println("Cydeo");

        System.out.println("----------------------------------------");

        try{
            FileInputStream file = new FileInputStream("File Path");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }


    }
}
