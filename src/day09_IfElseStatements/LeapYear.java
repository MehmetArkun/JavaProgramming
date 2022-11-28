package day09_IfElseStatements;

public class LeapYear {

    public static void main(String[] args) {

        int year = 1999;

        if (year % 4 == 0){
            System.out.println(year + " is a leap year");

        } else {
            System.out.println(year + " is not a leap year");
        }

        //we can also use ! with boolean, but in that case compiler needs to check both conditions


    }
}
