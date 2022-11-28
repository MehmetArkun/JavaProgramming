package day24_CustomMethod_Return;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        String str = "Java";

        String result = reverse(str);

        System.out.println(result);

        if (str.equalsIgnoreCase(result)){
            System.out.println(str + " is palindrome");
        }else {
            System.out.println(str + " is not palindrome");
        }


    }

    public static String reverse (String word){

        String reversedVersion = "";

        for (int i = word.length()-1; i >=0; i--) {

            String eachCh = word.charAt(i) + "";
            reversedVersion += eachCh;
        }

            return reversedVersion;
    }

}
