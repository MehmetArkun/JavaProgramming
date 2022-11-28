package day15_ForLoop;

public class ForLoopPractises {

    public static void main(String[] args) {

        //write a program that displays numbers between 15 and 45 (int)
        //like 15 16 17 18 etc...

        for (int i = 15; i<=45; i ++){
            System.out.print(i + " ");
        }

        System.out.println("---------------");

        //100 ~ 50

        for (int i = 100; i >= 50; i --){ // we used i variablename again as variables we use inside for loop block stays there
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("----------------------");


        // print all the even numbers between 1 ~ 55

        for (int i = 1; i <= 55; i++){

            if (i%2==0){
                System.out.print(i + " ");
            }

        }
        System.out.println();

        System.out.println("----------------------");

        // print all the even numbers between 1 ~ 55

        for (int i=2; i<=54; i+=2){
            System.out.print(i + " ");
        }






    }
}
