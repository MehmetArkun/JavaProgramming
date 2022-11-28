package day08_IfStatements;

import java.sql.SQLOutput;

public class GradeReport {

    public static void main(String[] args) {
/*
        System.out.println(true == !false); // true
        System.out.println(!true != false); // false
        System.out.println(!false == true); // true
        System.out.println(!!false);// false

        */

        int score = 85;
        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89;
        //boolean b = score >=80 && !a
        boolean c = score >= 70 && score <= 79;
        //boolean c = !a && !b && score >= 70
        boolean d = score >= 60 && score <= 69;
        boolean f = score >= 0 && score <= 59;
        //boolean f = !a && !b && !c && !d;

        if (a){ // if student made an A meaning if a boolean variable is true

            System.out.println("Excellent");

        }

        if (b){ // if student made an B meaning if b boolean variable is true

            System.out.println("Great");

        }

        if (c){// if student made an C meaning if c boolean variable is true

            System.out.println("Good");

        }

        if (d){// if student made an D meaning if d boolean variable is true

            System.out.println("Passed");

        }

        if (f){ // if student made an F meaning if f boolean variable is true

            System.out.println("Failed");

        }

//so basically boolean expressions are our conditions
        //we create conditions via boolean variables
        //then we use if statement to exceute the outcome



    }
}

/*

90 ~ 100 ==> Excellent
80 ~ 89 ==> Great
70 ~ 79 ==> Good
60 ~ 69 ==> Passed
0 ~ 59 ==> Failed

so here, there are 5 possible outcomes. therefore i will use 5 different single statements



 */