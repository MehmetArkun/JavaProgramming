package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        //trim() to remove white space -->unused space
        // it doesnt erase the spaces between words (characters)
        //just like upper and lower cases methods, it doesnt modify the string
        //gotta assign new variables

        //indexOf() gives the index number of the character in question inside paranthesis
        //it looks from left to right

        //lastIndexOf looks from right to left an gives the last one on the left

        //

        String str2 = "Cydeo School";

        int n1 = str2.indexOf('h');//veya "h"
        System.out.println("n1 = " + n1);// n1 = 8

        int n2 = str2.indexOf("ool"); // ilk o'nun index numberini almaya calisiyorum
        //o'nun birlesik oldugu obegi yazarsam, soldan saga ilk ona karsilacak
        // yani burada sonuc = 9
        System.out.println("n2 = " + n2);

        String st3 = "Java Programming Language";

        int n3 = st3.indexOf("am");
        System.out.println("n3 = " + n3);

        System.out.println("--------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        int fourthA = s.indexOf("ava W");
        //int fourthA = s.indexOf("CA") + 1;
        int fifthA = s.lastIndexOf("a W");
        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);











    }
}
