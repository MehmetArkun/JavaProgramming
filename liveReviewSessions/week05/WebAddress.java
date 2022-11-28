package week05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WebAddress {
    public static void main(String[] args) {

        // starts with: www.
        // ends with: .com , .edu , .gov

        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter a valid website: such as www.amazon.com");
        String userEntry = scanner.next();

        int indexOfFirstDot = userEntry.indexOf(".");
        int indexOfSecondDot = userEntry.lastIndexOf(".");

        String beginningOfUrl = userEntry.substring(0, indexOfFirstDot);
        String endgingOfUrl = userEntry.substring(indexOfSecondDot);

        boolean isValid = beginningOfUrl.equalsIgnoreCase("www") &&
                endgingOfUrl.equalsIgnoreCase("com") || endgingOfUrl.equalsIgnoreCase("gov")
                || endgingOfUrl.equalsIgnoreCase("edu");

        if (isValid){
            System.out.println("Valid Website");

        }else{
            System.out.println("Not valid");
        }

        scanner.close();




    }
}
