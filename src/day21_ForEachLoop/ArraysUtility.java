package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int [] scores = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(scores));
        //toString

        // eveyrtime you put array object inside print statement
        //compiler looks for toString method
        //if it cant find then it print hastag code as output

        String str = "Java";

        System.out.println(str);
        System.out.println(str.toString());
        // compiler calls toString method implicilictly everytime you try to print string
        //thats why we dont get hashcode
        //when it comes to arrays, you have to call the methods from utility of array explicitly
        //so toString method converts the array object (single dimensional) to string

        //sort

        //it sorts the elements of the array in ascending order

        Arrays.sort(scores);

        System.out.println("Min score: " + scores[0]);
        System.out.println("Max Score: " + scores [scores.length-1]);

        String [] names = {"Gunay", "Anna", "Zulal", "Ahmet", "Maria", "Sinema"};
        //[Ahmet, Anna, Gunay, Maria, Sinema, Zulal]
        //sort edecegimiz icin boyle cikaracak. harfleri asci table a gore siralayacak

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        String [] words = {"Anna", "ANNA"};

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));
        //ANNA ilk basa gelecek cunku asci table a gore uppercase in numarasi daha dusuk

        //equals method

        //when you call this method you have to put two arguments

        int [] arr1 = {1,3,2};
        int [] arr2 = {1,2,3};

        Arrays.equals(arr1,arr2); // result is boolean, so we can assign it to a boolean variable
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);//false cunku siralama farkli

        Arrays.sort(arr1);//siralamayi sort ettik
        Arrays.sort(arr2);//buna da sort ettik

        boolean r2 = Arrays.equals(arr1,arr2);//artik true
        System.out.println(r2);//artik true, index numberlar esit


        System.out.println("==========================================");

        char [] ch1 = {'a', 'c', 'b'};
        char [] ch2 = {'b', 'c', 'a'};

        Arrays.sort(ch2);//{a,b,c}
        Arrays.sort(ch1);//{a,b,c}

        boolean characters = Arrays.equals(ch1,ch2);

        System.out.println(characters);

        System.out.println("=======================");

        //copyOf
        // arrayi copyalar, copyOf(kopyalanacakarrayismi, istenen index uzunlugu)
        //ArraysUtility2'ye bak aciklama icin






    }
}
