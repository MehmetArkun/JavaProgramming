package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int [] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];

        //numbers.fori = shortcut for loop
        //numbers.forr = reversed loop shortcut

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max = numbers[i];
            }

        }

        System.out.println("max = " + max);













    }
}
