package day03_EscapeSequences;

/*
Escape sequences: MUST be given with double quote
    \n: starts a new line
    \t: paragraph (tab)
    \\: gives single backslash
    \": gives double quote - you have to give another one at the end

 */

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#");
        System.out.println("------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("\tJava is Cool Programming Language");

        System.out.println("-----------------------------------");

        System.out.println("/ \\"); // in order to print one back slash you gotta input two back slashes

        System.out.println("-----------------------------------");

        System.out.println("My favourite TV show is \"Game of Thrones\""); // in order to print double quote, we need to use \"


    }


}
