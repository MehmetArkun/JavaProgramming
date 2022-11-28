package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        //toCharArray() converts striong to char array

        String str = "Java";

        for (char each : str.toCharArray()){
            System.out.print(each);
        }

        System.out.println("================");

        String str2 = "Aslan";

        char [] str2Chars = str2.toCharArray();

        System.out.println(Arrays.toString(str2Chars));

        System.out.println("---------------------------");

        // split(value) method returns String Array

       // "I love learning java programming language".split("space") -->
        //{"I", "love", "learning", ...}
        //eger string "ABC" bosluksuz ise
        //o zaman split icine value vermeyeceksin
        //"ABC".split("") --> {"A", "B", "C"}

        String sentence = "Wooden Spoon";
        String [] strArray= sentence.split(" ");

        System.out.println(Arrays.toString(strArray));

        System.out.println("=======================");

        String email = "WoodenSpoon@cydeo.com";

        String [] emailArray = email.split("@");
        System.out.println(Arrays.toString(emailArray));

        System.out.println("--------------------------");

        String s = "Today is a nice day. Today is Monday. Today we learn Java";

        String [] sArray =s.split("\\.");//nokta icin backlash kullaniyoruz. noktaya ozel

        System.out.println(Arrays.toString(sArray));




    }
}
