package day09_IfElseStatements;

public class MinNumber {

    public static void main(String[] args) {

        int n1 = 100, n2 = 200;

        //possibility 1: n1 is min
        //possibility 2: n2 is min
        //possibility 3: they're equal
        //so, there are 3 different possible outcomes
        //so, we need 3 different single if statements

        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n2 < n1;
        boolean n1n2Equal = n1 == n2;

        if (n1IsMin){
            System.out.println(n1 + " is the minimum number.");
        }


        if (n2IsMin){
            System.out.println(n2 + " is the minimum number.");
        }

        if (n1n2Equal){
            System.out.println(n1 + " and " + n2 + " are equal.");
        }


    }
}

/*
create a class called MinNumber wrire a pprogram that can print
the miunimum number between two numbers, if both are equal,
then print equal

output: 100 is the minimum number
 */