package day21_ForEachLoop;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        String [] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};

        String [] earlyBirds = Arrays.copyOf(students, 3);
        //studentstaki ilk 3 indexi kopyalayacak
        //oradaki 3 3. index degil, length e tekabul eden 3.
        //yeni lenght bir onckei arrayin lengthini asarsa, kalan sahalar null
        //for instance, Arrays.copyOf(students, 30)-->burada gordugumuz gibi lengthi astik

        System.out.println(Arrays.toString(earlyBirds));

        int [] numbers = {1,2,3,4,5};
        numbers = Arrays.copyOf(numbers,3);
        //burada gordugumuz gibi eskisini kullanarak yeni value atar gibi copyOf kullandik
        //ikinic number da brackets yok, gerek de yok
        //bracketsi yeni array declare ederken ve initlize ederken kullaniyoruz

        System.out.println("================================");

        //copyOfRange
        //substring gibi isliyor, ilk indexi alir, son indexi birakir exclude eder
        //burada copyOf tan farkli olarak parantez icine yazdiklarimiz ondex numaralari

        char [] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char [] ch2 = Arrays.copyOfRange(ch1, 2,6+1);

        System.out.println(Arrays.toString(ch2));

        int [] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int [] result = Arrays.copyOfRange(scores, 3, 8);

        System.out.println(Arrays.toString(result));

        int [] result2 = Arrays.copyOfRange(scores, 3, scores.length);
        System.out.println(Arrays.toString(result2));


    }
}
