package day16_ForLoopStringPractice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String word = "AABCCD";
        String unique = "";

        for (int i = 0; i <= word.length()-1; i++) {

            char ch = word.charAt(i);

            if (word.indexOf(ch)==word.lastIndexOf(ch)){
                unique += ch;
            }

        }

        System.out.println(unique);



    }
}

/*
Write a program that can return the unique characters from a
String
Ex:
input:
AABCCD
output:
BD
Hint: You will need indexOf() and
lastIndexOf()
  if the first and last index
numbers of the character are same, then it's unique
  indexOf('A') ==> 0
  lastIndexOf('A') ==> 1
  indexOf('B') ==>2
  lastIndexOf('B') ==> 2
 */