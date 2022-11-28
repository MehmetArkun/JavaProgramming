package day10_NestedIf;

public class IfStatementsWithoutCurlyBraces {

    public static void main(String[] args) {

        int number = 10;
        String nameOfMonth = "";

        if (number>=1 && number<=12)
            if (number == 1)//if there is only one statement within if statement, then there is no need to use curly braces
                nameOfMonth = "January";

             else if (number == 2) {
                nameOfMonth = "February";

            } else if (number == 3) {
                nameOfMonth = "March";

            } else if (number == 4) {
                nameOfMonth = "April";

            } else if (number == 5) {
                nameOfMonth = "May";

            } else if (number == 6) {
                nameOfMonth = "June";

            } else if (number == 7) {
                nameOfMonth = "July";

            } else if (number == 8) {
                nameOfMonth = "August";

            } else if (number == 9) {
                nameOfMonth = "September";

            } else if (number == 10) {
                nameOfMonth = "October";

            } else if (number == 11) {
                nameOfMonth = "November";

            } else{

                nameOfMonth = "December";
            }

        else{
            nameOfMonth = "Invalid";
        }

        System.out.println(nameOfMonth);

    }
}
