package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//enter burada saklaniyor

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your programming language");
        String programmingLanguage = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();//33 + enter enter iokuyamiyor int scannera yolluyor
        input.nextLine(); //dolyayisiyla buraya yeni bir method koyuyoruz ki enter buraya gitsin
        //okula gitmesin

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();//buraya enter geliyor otomatik (bos gozukuyor konsolda)

        System.out.println("Name: " + fullName);
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();


    }
}
