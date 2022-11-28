package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

    // 28 characters in array

        char [] alphabets = new char[26];

        for (char i = 0, j = 'Z'; i < alphabets.length && j>='A'; i++ , j--) {
            alphabets[i] = j;
        }

        System.out.println(Arrays.toString(alphabets));


    }
}
