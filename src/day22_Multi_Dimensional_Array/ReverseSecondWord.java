package day22_Multi_Dimensional_Array;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        String reverse ="";

        for (int i = words[1].length()-1; i >= 0; i--) {
            reverse+= words[1].charAt(i);
        }

        System.out.println(reverse);

        // sentence = sentence.replaceFirst(words[1], reverse);

        words[1] = reverse;

        for (String each : words) {
            System.out.print(each + " ");
        }


    }
}

/*
write a program that can reverse the second word of the sentence

ex:
sentence = "I Love Java"

output
 I evoL Java
 */