package day43_Abstraction;

import java.util.Scanner;

public class Throw_vs_Throws {

    public static void main(String[] args) {

        System.out.println("Enter your score: ");
        int score = new Scanner(System.in).nextInt();

        if (score < 0 || score >100){

            throw new RuntimeException("Invalid Score: " + score);
        }

        if (score >= 90){
            System.out.println("A");
        } else if (score>=80) {
            System.out.println("B");
        } else if (score >=70) {
            System.out.println("C");
        } else if (score >=60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }


    }

    public static void method() throws InterruptedException{
        Thread.sleep(5000);
    }//bu methodun icinde exceptionu handle ettik.
    //normalde thread'te exception vardi. bu methodu simdi gidip yukarida ana public classin icinde kullanmaya kalksam
    //yine error verecek, cunku exceptioni throws keyword ile handle ettik.
    //eger try&catch keyword ile handle edersek, permament olur. gecici olmaz.
    //throws keyword ile gecici oluyor.
}
