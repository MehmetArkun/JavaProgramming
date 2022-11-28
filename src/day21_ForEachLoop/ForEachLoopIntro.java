package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        // for (data type variablename : dataStructure){
        //}

        // int [] numbers = {3, 6, 9, }
        //for (int each : numbers){
        // System.out.println (each):
        //}

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        for (int i = 0; i < numbers.length; i++) {
            int eachElement = numbers[i];
            System.out.print(eachElement+" ");
        }

        System.out.println("=====================");

        for (int eachElement : numbers){
            System.out.println(eachElement);
        }


    }
}
