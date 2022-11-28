package day13_StringClass;

import java.lang.String;

public class StringIntro {

    public static void main(String[] args) {

        String name = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";

        // string literal ile olusturduk. value'lar ayni.
        //bunlar java heap memory'de pool memory de saklaniyor.
        //hepsi bir wooden spoon olarak saklaniyor
        //dolayisiyla boolean expression bunlarin esit olup olmadigina dair true output verir

        System.out.println(name == name2);//true
        System.out.println(name == name3);//true
        System.out.println(name2 == name3);//true

        System.out.println("----------------");

        String n1 = new String("Wooden Spoon");
        String n2 = new String ("Wooden Spoon");
        String n3 = new String("Wooden Spoon");

        //bu stringleri new keyword ile olusturduk
        //bunlar ayri ayri saklanirlar heap memory'de ama pool disinda saklanirlar
        //dolayisiyla boolean expression bunlara esit demez false output verir

        System.out.println(n1 == n2);//false
        System.out.println(n1 == n3);//false
        System.out.println(n2 == n3);//false

        System.out.println("------------------");

        // eger elimizde farkli sekillde olusturulmus ayni texti iceren stringler varsa,
        //onlari variablename1.equals(variablename2) methodu ile compare edebiliriz
        //misal:

        String s1 = "Java"; // string literal ile olusturuldu
        String s2 = new String ("Java"); // new keyword ile olusturuldu

        // normalde bunlar farkli. cunku biri pool icinde digeri disinda saklaniyor
        //compare edersem == relational operator ile, bana false verecek output
        //ama ben icerigindeki string of text ile ilgileniyorum
        //dolayisiyla variablename1.equals(variablename2) methodu ile check edecegim

        System.out.println(s1.equals(s2));// true, cunku icerik ayni




    }
}
