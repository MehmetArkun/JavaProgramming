package day42_Exceptions;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws ArithmeticException {

        System.out.println("Test Started");

        System.out.println(8/0);

        System.out.println("Test Completed");

        // even though we put throws keyword, it was not handled as it is unchecked exception





    }
}
