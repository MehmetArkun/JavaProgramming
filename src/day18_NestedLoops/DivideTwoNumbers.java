package day18_NestedLoops;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        /*
        a=20
        b=6

        a-=b; // a=14
        a-=b; // a=8
        a-=b; // a=2

        //as long as the second number is smaller than first one we can continue to substract

        so,
        int count =0;

        while (a>=b) {
        a-=b;
        count++

        }
         */

        int a =30;
        int b = 7;
        int countOfDivision = 0;

        while (a>=b){
            a-=b;
            countOfDivision++;
        }

        System.out.println(countOfDivision);
        System.out.println(a);//remainder



    }
}


/*
write a program that can divide two positive numbers without using division
and multiplication operators
 */