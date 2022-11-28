package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {

        //substring() if you wanna get some portion of the string then you can use this
        //you will provide the beginning and ending indexes
        //substring(beginning index , ending index)

        String word = "Cydeo School";
        //index        012345
        String brand = word.substring(0,4+1);
        System.out.println("brand = " + brand);

        String str1 = word.substring(6,11+1);
        //veya sadece 6 yazabiliriz de
        System.out.println("str1 = " + str1);

        String word2 = "Java Programming Language";

        String s1;
        String s2;
        String s3;

        s1 = word2.substring(0, word2.indexOf(" "));//"Java"
        System.out.println("s1 = " + s1);

        s2 = word2.substring(word2.indexOf(" ")+1 , word2.lastIndexOf(" "));
        System.out.println("s2 = " + s2);

        s3 = word2.substring(word2.lastIndexOf(" ")+1);
        System.out.println("s3 = " + s3);
        //sinirlarimizi boslukla ifade ettik
        //cunku kelimeler degisir, bosluklar kalir







    }
}
