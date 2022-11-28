package day09_IfElseStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10, b = 15, c = 20;

        //either a or b or c can be median number
        //therefore there are 3 different possible outcomes
        //so we are gonna create 3 boolean expressions
        //we are gonna use 3 different single if statements

        boolean aIsMedian = (a>b && a<c) || (a>c && a<b);
        boolean bIsMedian = (b>a && b<c) || (b>c && b<a);
        boolean cIsMedian = (c>a && c<b) || (c>b && c<a);
      //boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian){
            System.out.println(a + " is median number");
        }

        if (bIsMedian){
            System.out.println(b + " is median number");
        }

        if (cIsMedian){
            System.out.println(c + " is median number");
        }


    }
}

/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers
			Ex:
				a = 10, b= 15, c = 20;
			Output:
				15 is the median number
			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number
 */