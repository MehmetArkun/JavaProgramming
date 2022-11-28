package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        //create a variable that is capable enough to contain 5 names

       String [] myGroup = new String[5];

       myGroup [0] = "Gunay";
       myGroup [1] = "Neira";
       myGroup [2] = "Suat";
       myGroup [3] = "Hulya";
       myGroup [4] = "Mikael";

        System.out.println(Arrays.toString(myGroup));//[null, null, null, null, null]
        // in order to printing single dimensional array, you need to call to string method
        //first you need to call Arrays class//java.util.Arrays
        //then you gotta use toString method

        //[null, null, null, null, null] is the default value of non-primitive data types
        //it means null refers to no object

        System.out.println("-----------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 3;

        if (number < 1 || number > 7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number]);

    }
}
