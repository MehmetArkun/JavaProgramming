package day24_CustomMethod_Return;

public class ReturnMethodPractice4 {

    public static void main(String[] args) {

        String removedVersion = removeDuplicates("aaaaaabbbbbbccccccddddgggghhhhhhssssssss");
        System.out.println(removedVersion);

    }


    // 1. create a method that can remove duplicated characters from a strong and returns the new value

    public static String removeDuplicates(String str){ // "aaabbcc"

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains(""+each)){
                result += each;
            }
        }

        return result;


    }


}
