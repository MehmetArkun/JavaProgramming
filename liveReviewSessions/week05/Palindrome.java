package week05;

public class Palindrome {

    public static void main(String[] args) {

        String word = "MadAM";

        //how to reserve this word

        String result = "";

        result += word.charAt(4);
        result += word.charAt(3);
        result += word.charAt(3);
        result += word.charAt(1);
        result += word.charAt(0);


        if (word.equals(result)){
            System.out.println(result);
        }



    }
}
