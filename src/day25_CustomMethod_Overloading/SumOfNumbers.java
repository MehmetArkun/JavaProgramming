package day25_CustomMethod_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sumOfTwoNUmbers = sumOf2Numbers(10,11);
        System.out.println(sumOfTwoNUmbers);
        System.out.println("-----------------");

        int sumOfThreeNumbers = sumOf3Numbers(9,5,6);
        System.out.println(sumOfThreeNumbers);
        System.out.println("-----------------");

        int sumOfFourNumbers = sumOf4Numbers(5,6,2,8);
        System.out.println(sumOfFourNumbers);
        System.out.println("-----------------------");





    }


    public static int sumOf2Numbers (int number1, int number2){
        int sum = number1+number2;
        return sum;
    }

    public static int sumOf3Numbers (int number1, int number2, int number3){

        int sum = number1+number2+number3;
        return number1+number2+number3;

    }

    public static int sumOf4Numbers (int number1, int number2, int number3, int number4){
        return number1+number2+number3+number4;
    }


}

/*
/*
Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers
	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers
	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */

