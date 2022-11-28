package week04;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        //We will get two numbers of double from user and we will get a char (+, -, /, %, *)

        double num1, num2,
                result = 0;
        char operator;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two double type numbers");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        System.out.println("Enter arithmetic operation you want (+,-,/,%,*): ");
        operator = scanner.next().charAt(0); // to get char with scanner

        System.out.println("Is first number bigger than second number?");
        boolean answer = scanner.nextBoolean(); // true or false


        switch (operator) {

            case '+':
                result = num1 + num2;
                break;

            case '-':
                if (answer) {
                    result = num1 - num2;
                } else {
                    result = num2 - num1;
                }

            case '/':
                if (answer && num2 != 0) {
                    result = num1 / num2;
                } else {
                    if (num1 != 0) {
                        result = num2 / num1;

                    } else {
                        System.out.println("Unwanted number");
                    }
                }
                break;

            case '*':
                result = num1 * num2;
                break;

            case '%':
                /*
                variable = condition ? num1%num2 : num
                 */

                result = answer ? num1%num2 :num2%num1;
                break;

        }
        System.out.println(result);

    }
}
