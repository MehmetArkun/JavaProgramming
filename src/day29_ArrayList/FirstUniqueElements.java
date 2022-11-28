package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList <>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        for (int i = 0; i < list.size(); i++) {
            int each = list.get(i);
            int frequency = 0;

            for (int j = 0; j < list.size(); j++) {
                if (each == list.get(j)){
                    frequency++;
                }
            }

            if (frequency==1){
                System.out.println(each);
                break;
            }

        }


    }
}

/*
write a program that can find the first unique elements
without index of and lastindexof
 */
