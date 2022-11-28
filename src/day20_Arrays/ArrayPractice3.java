package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers you want to enter?");
        int length = input.nextInt();

        if (length<=0){
            System.out.println("Invalid Entry");
            System.exit(0);
        }

        int [] numbers = new int[length];

        for (int i = 0; i<length; i++){
            System.out.println("Enter a number");
            numbers [i] = input.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

    }
}
