package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("10"+10); //result: 1010 --> concatenation
        System.out.println(100-50);//result: 50, subtraction

        System.out.println(10/4);//33
        System.out.println(10.0/4);//2.5
        System.out.println(10/4.0);//2.5
        System.out.println(10/4d);//2.5

        int a = 100;
        double b = a/6; //16.0 --> but this is actually not the exact result mathematically
        //normally we are supposed to get something like 16.6
        //since it is integer/integer (100/6), it gives integer
        //but it gives it as a decimal in the print because double is decimal data type
        //so that's why it gives 16.0
        //in order to get the right result, division should have at least one decimal
        //so,

        double c = a/6d; //this will give right and decimal result, since there is at least one decimal in the division
        //we put a d to 6

        //double c = (double)a/6; --> you can also do explicit casting to get right result 16.6666

        System.out.println("c= "+ c);

        System.out.println(100d);// this is also decimal

        System.out.println(10%4);//this is 2 because remainder is 2
        //remainder: numerator - (denominator * integer result)
        //           10 - (4 * 2) = 2

        System.out.println(20%5);//0 is the result







    }


}


/*

+: Addition
-: Subtract
*: Multiplication
%: Remainder
/: Division

integer/integer --->integer
decimal/integer --->decimal
integer/decimal --->decimal
decimal/decimal--->decimal


        in math:
        10/4 = 2.5

        in java:
        10/4 = 2 --> it will give intreger result beacuse numerator and numerator are integers
        10.0/4 = 2.5 --> if you make sure one of them is decimal, then you can get decimal result
        10/4.0 = 2.5
        10/4d = 2.5 --> you can also give d or D to numerator or denumerator to get decimal result
 */