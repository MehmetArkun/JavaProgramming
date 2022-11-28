package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantagesOfThrowsKeyword2 {

    public static void method1 () throws FileNotFoundException {
        new FileInputStream("");
    }


    public static void method2 () throws FileNotFoundException {
        method1();
    }

    public static void method3 () {
        try {
            method2();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
