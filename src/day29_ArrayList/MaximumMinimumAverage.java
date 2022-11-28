package day29_ArrayList;

import java.util.ArrayList;

public class MaximumMinimumAverage {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list);

        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;

        for (Integer each : list) {
            if(each>max){
                max=each;
            }

            sum+=each;
        }

        for (Integer each : list) {
            if(each<min){//bu if'i ilk for icine de koyabilirdik
                min=each;
            }
        }

        double average = (double)sum / list.size();
        System.out.println("average = " + average);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
