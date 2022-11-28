package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {
        System.out.println("Enter word xcodeX");
        String str = new Scanner (System.in).next(); // str = "xcodeX"
        str = str.replace("x","a").replace("X","a");
        System.out.println(str);
    }
}


/*
write a program that asks user to enter a word and replace
all the x or X with character a

input = xCodeX
output = acodea
 */