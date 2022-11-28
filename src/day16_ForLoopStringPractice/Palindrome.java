package day16_ForLoopStringPractice;

public class Palindrome {

    public static void main(String[] args) {

        String word = "Racecar";

        String reversed = "";

        for (int i = word.length()-1; i >= 0; i--) {

            reversed+=word.charAt(i);

        }
        System.out.println("word = " + word);
        System.out.println("reversed = " + reversed);
        System.out.println("is it equal? = " + word.equalsIgnoreCase(reversed));
    }
}

/*

"Java" --> "avaJ" -- this is not palindrome

"Anna" --> "annA" -- this is palindrome

"Level" --> "leveL" -- this is palindrome

"Racecar" --> Palindrome


 */