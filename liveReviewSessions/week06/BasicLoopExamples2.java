package week06;

public class BasicLoopExamples2 {

    public static void main(String[] args) {

        /*
        write a program that displays the number of even numbers between 5 and 50 (included)
         */

        int countOfEvens = 0;

        for (int i =5; i<=50; i++ ){
            if ((i%2)==0){
                ++countOfEvens;
            }
        }
        System.out.println(countOfEvens);

    }
}
