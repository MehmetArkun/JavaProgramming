package day42_Exceptions;

import java.lang.reflect.Constructor;

public class Test {

    public Test () {
        System.out.println("Developer");    }

    public void Test () {
        System.out.println("SDET");
    }



    public static void main(String[] args) {
        Test obj = new Test();
    }
}
