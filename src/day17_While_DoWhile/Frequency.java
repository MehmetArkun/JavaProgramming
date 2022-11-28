package day17_While_DoWhile;

public class Frequency {

    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if (eachChar==ch){
                ++frequency;
            }

        }
        System.out.println(frequency);


    }
}

/*
write a program that can return the frequency of a char from a String

str=AAABBBC

output: 3 (count)

 */