package utilities;

import java.util.Arrays;

public class StringUtility {

    public static void main(String[] args) {

    }

    //prints each characters of the given string
    public static void printEachChar (String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }


    //reverses a string
    public static String reverseString (String str){

        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed += str.charAt(i);
        }

        return reversed;


    }


    //returns true if a given string is palindrome, otherwise, it returns false
    public static boolean isPalindrome (String str){
            //boolean isP = reverseString(str).equalsIgnoreCase(str);
           // return isP;
        //yukaridaki gibi de yapabiliriz asagidaki gibi de

        return reverseString(str).equalsIgnoreCase(str);
            //burada stringi reverse edip normaliyle karsilastirmak icin bir daha loop kullanmadik
           //zaten olusturdugumuz reversed methodu kullandik

    }

    //checks if given string is anagram, and returns boolean
    public static boolean anagram (String str1, String str2){
        //anagram oldukarini anlamak icin, ikisinde ayni karakterler var mi yok mu bakmak lazim
        //stringde bakamayiz
        //ama arraye donusturursek bakariz
        //o yuzden once char arraye donusturuyoruz
        //sonra sort ediyoruz
        //sort ettikten sonra arrayler birbirne esit mi degil mi bakiyoruz
        //esitse zaten anagramdir
        //direk equals methodu return edebilirz
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);


    }

    //removes the duplicates from given string, returns string
    public static String removeDuplicates (String str){
        String removedVersion = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!(removedVersion.contains(""+each))){
                removedVersion+=each;
            }
        }
       return removedVersion;


    }

}
