package day16_ForLoopStringPractice;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbcc";
        //abc is our final expected result

        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {// i represents index numbers of characters in str

            String ch = "" + str.charAt(i); // represents each character of str

            if ( !result.contains(ch) ) {//if the character is not contained in the result

                result += ch;// the character will be added to the result

            }
        }

        System.out.print(result);

    }

}



/*

Write a program that can remove the duplicated characters from a
String
Ex:
input:
AABBCCBC

Output:
ABC

Hint: You can add each characters of the string into another String
Condition: the character is not contained in the other String yet before you are adding

 */