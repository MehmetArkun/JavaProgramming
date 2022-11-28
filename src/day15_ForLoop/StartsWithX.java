package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        System.out.println("Enter a word");
        String word = new Scanner(System.in).next(); // xcodex

        if(word.charAt(0)=='x'){
            word = word.replaceFirst("x","a");
            System.out.println(word);
        }


        }

    }


/*
write a program that asks user to write a word.
if the word starts with x, replace it with a.
 */