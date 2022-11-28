package day42_Exceptions;

import java.io.FileNotFoundException;

public class ThrowsKeywordIntro {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        //even in ampul, throws keyword is the first solution

        /*
        -may be used within the method signature
        -fastest solution instead of trycatch blocks for CHECKED exception
        -informs the compiler that method throws one of the losted type exception
        -it is used in method syntax right before the method body
        -cheap way to handle
        -temporary solution
        -caller method is responbile for throwing exception
        -if the method is not gonna be called again, you can use throws keyword

         */

        System.out.println("----------------Test 1-------------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("----------------Test 1 Completed-------------------");

        System.out.println("----------------Test 2-----------------------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Batch 25");

        System.out.println("----------------Test 2 Completed-------------------");



    }
}
