package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25;// you dont have to use + operator to indicate number is positive
        int num2 = -25; // if you wanna indicate a number is negative then you have to use negative unary operator

        System.out.println("--------------------------------");

        int a = 5;
        ++a; //pre-increment: increases the value by 1 right away

        System.out.println(a);

        --a; // pre-decrement: decreases the value by 1 right away

        System.out.println(a);

        int c = 100;

        System.out.println(c++); // it will give the former value, namely 100
        System.out.println(c); // this will give 101. because post increment is implemented in the next step

        int x = 200;

        System.out.println(--x ); // pre-increment: decreases the value by 1 right away

        int y = 200;

        System.out.println(y--); // post-decrement: first passes the current value, then decreases the value by 1

        System.out.println("----------------");

        int z = 45;

        System.out.println(++z);// pre-increment: it increases to 46 immeaditely
        System.out.println(z++);// post-increment: it stays the same, namely 46
        System.out.println(z);// here it is gonna increase to 47 since this is the next step

        System.out.println("---------------");

        int q = 30;

        System.out.println(--q);//29
        System.out.println(q--);//29 again, only to be decreased on next step
        System.out.println(q);//28here








    }
}
