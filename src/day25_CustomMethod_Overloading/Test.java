package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";
        StringUtility.printEachChar(str);

        System.out.println("----------------------------");

        String s1 = "Wooden Spoon";
        String reversed = StringUtility.reverseString(s1);
        System.out.println(reversed);

        System.out.println("---------------------------");

        String str2 = "Ana";
        boolean isP = StringUtility.isPalindrome(str2);
        System.out.println(isP);

        System.out.println("----------------");

        String [] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("---------------------------------------------------");

        String str4 = "aaaabbbbcccccddddeeefffggg";

        String remove = StringUtility.removeDuplicates(str4);
        System.out.println(remove);

        System.out.println("---------------");


    }
}
