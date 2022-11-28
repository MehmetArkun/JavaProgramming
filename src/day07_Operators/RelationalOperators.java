package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // >,<, >=,<= used only for numbers
        
        boolean result1 = 20>40; // false
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150; // true
        System.out.println("result2 = " + result2);

        boolean result3 = 100>=100; // true
        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500; // false
        System.out.println("result4 = " + result4);

        //requirement: credit score of 720

        int creditScoreOfStudent = 745;

        boolean isEligibleForLoan = creditScoreOfStudent >= 720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result5 = 100 < 120; // true
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180; // false
        System.out.println("result6 = " + result6);

        // equal operator == can be used for both numbers and strings

        boolean result8 = "Muhtar" == "Good Guy"; // false
        System.out.println("result8 = " + result8);

        boolean result9 = 'A'=='a';
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java"; // true
        System.out.println("result10 = " + result10);

        System.out.println("-----------------------");


        // not equal operator != can be used for both numbers and strings

        boolean result11 = 100 != 200; // true
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "java";// true
        System.out.println("result12 = " + result12);

        boolean result13 = 300 != 300; // false
        System.out.println("result13 = " + result13);







    }
}
