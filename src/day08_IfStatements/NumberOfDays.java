package day08_IfStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 5;

        boolean has28Days = number == 2;
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        boolean has31Days = ! has28Days && !has30Days;

        if (has28Days){//if the month has 28 days
            System.out.println("28 Days");
        }


        if (has30Days){
            System.out.println("30 Days");
        }

        if (has31Days){
            System.out.println(" 31 Days");
        }

        //in conclusion, if statement is all about creating the condition.
        //it is all about creating the boolean expression
        //once we create the boolean expression, we put the boolean expression within the paranthesis of if
        //and whichever code fragment we want to execute on that condition, can be placed within the body of that statement

        int n1 = 122, n2 = 398;
        boolean n1max = n1>n2, n2max = n2>n1;

        if (n1max) {
            System.out.println("Max number is: " + n1);
        }
        if (n2max){
            System.out.println("Max number is: " + n2);
        }


    }
}

/*
3. Create a class called NumberOfDays, Write a program that can print the number of days in a month
            Ex:
                number = 1;
            output:
                31 Days
            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
 */