package day13_StringClass;

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {

        //variablename.charAt(index): returns the index in char
        //variablename.length(): returns the total number of characters in int number
        //variablename.toUpperCase: convert the string to upper case but you gotta re-assign the variable beacase string is immutable
        //variablename.toLowerCase: same function with upper case method

        String word = "Cydeo";

        char thirdCharacter = word.charAt(3);

        System.out.println("thirdCharacter = " + thirdCharacter);



        System.out.println("---------------");

        String s1 = "Batch 25 is the best batch";

        int totalCharacters = s1.length();

        System.out.println(totalCharacters);

        char lastChar = s1.charAt(s1.length()-1);
        System.out.println(lastChar);

        System.out.println("---------------------");


        Scanner input = new Scanner(System.in);

        System.out.println("please enter a lower case two words");

        String str = input.nextLine();

        str= str.toUpperCase();//we need to re-assign str variable to this method so it can return as uppercase

        System.out.println(str);

        System.out.println("------------");

        System.out.println("please enter a long sentence in lower case: today is a great day to learn java programming language");

        String sentence = input.nextLine();

        sentence = sentence.toUpperCase();

        System.out.println(sentence);

    }
}
