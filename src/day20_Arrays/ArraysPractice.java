package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        //store elements: 10, 20, 50, 70
        //since we know what those elements are and how many elements we have
        //then we can use curly braces style to initialize the array
        int[] numbers = {10, 20, 50, 70};

        System.out.println(Arrays.toString(numbers));
        //to print the entire array, we call array class and use toString method inside print statement

        System.out.println("----------------------");

        //create a variable that contain 5 scores

        int[] scores = new int[5];

        scores[1] = 85;
        scores[scores.length - 1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;

        System.out.println(Arrays.toString(scores));

        System.out.println("---------------------");

        String[] month = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October", "November",
                "December"};
/*
        System.out.println(month[0]);
        System.out.println(month[1]);
        System.out.println(month[2]);
        System.out.println(month[3]);
        System.out.println(month[4]);
        System.out.println(month[5]);
        System.out.println(month[6]);
        System.out.println(month[7]);
        System.out.println(month[8]);
        System.out.println(month[9]);
        System.out.println(month[10]);
        System.out.println(month[11]);


 */

        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i]);

        }

        System.out.println("------------------");
        for (int i = month.length-1; i >=0; i--) {
            System.out.println(month[i]);

        }


    }
}
