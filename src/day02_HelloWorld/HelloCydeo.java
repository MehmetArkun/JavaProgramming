package day02_HelloWorld;

import day24_CustomMethod_Return.ReturnMethodIntro;
import day24_CustomMethod_Return.ReturnMethodPractice4;
import day25_CustomMethod_Overloading.SumOfNumbers;

public class HelloCydeo {

    public static void main(String[] args) {


        System.out.println("Hello Cydeo");

        float a = 100.987_6543f;
        short b = (byte) a;

        System.out.println(b);

        System.out.println("------------");

        // baska classlarda olusturdugumuz methodlari burada kullanma alistirmasi

        String duplicates = "ajkdfhiuehafshadfhjsadlfh";

        String bakBakalim = ReturnMethodPractice4.removeDuplicates(duplicates);

        System.out.println(bakBakalim);

        System.out.println("------------");

        String deliDana = "Hayda Breeee";

        String bunaDaBak = ReturnMethodIntro.reverse(deliDana);

        System.out.println(bunaDaBak);

        System.out.println("Hello Diona!");

        String park = "Diona is looking";
        int numberData = 1;
        double decimal = 1.5;
        System.out.println(park);


    }



}
