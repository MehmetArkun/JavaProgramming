package day21_ForEachLoop;

public class MaximumNumber {

    public static void main(String[] args) {

        int [] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];

        for (int each : numbers) {
            if(each>max){
                max=each;
            }
        }

        double sum = 0;
        for (int each : numbers) {
            sum+=each;
        }

        double average = sum/ numbers.length;
        System.out.println(average);

    }
}
