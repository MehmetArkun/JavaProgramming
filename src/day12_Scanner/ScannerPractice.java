package day12_Scanner;

//import java.util.*;// wild import --> it is going to import everything from that util package

import java.util.Scanner;

public class ScannerPractice {

    public static void main (String [] args ){

        Scanner scan = new Scanner (System.in);
        //burada aslinda scan variableina scanner assign ediyoruz bir daha kullanalim diye
        //sadece scanner object de yazabilriz
        //like this: new Scanner (System.in).nextInt();
        //bunu ama bir defa kullaniriz
        //ikinci defa kullanabilmek icin variable haline getiriyoruz

        System.out.println("Enter a number between 1 to 7");

        int num = scan.nextInt();

        String result = "";

        if(num>=1 && num<=7){

            result = (num==1)?"Monday" :(num==2)?"Tuesday" :(num==3)?"Wednesday"
        :(num==4)?"Thursday" :(num==5)?"Friday" :(num==6)? "Saturday" : "Sunday";




        }else {
            result = "Invalid Number";
        }

        System.out.println(result);

        scan.close();



    }
}
