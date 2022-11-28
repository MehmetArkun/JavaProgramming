package week04;

import java.util.Scanner;

public class AdaireApartments {

    public static void main(String[] args) {

        Scanner input = new Scanner((System.in));

        System.out.println("Which floor do you live at?");
        int floorNumber = input.nextInt();

        if (floorNumber==1){
            System.out.println("You live at floor 1");
        } else if (floorNumber==2) {
            System.out.println("you live at floor 2");

        }else {
            System.out.println("there is no such floor");

        }

        //switch statement


        switch (floorNumber){

            case 1:
                System.out.println("you live at first floor");
                break;

            case 2:
                System.out.println("you live at second floor");
                break;

            case 3:
                System.out.println("you live at third floor");
                break;

            default:
                System.out.println("there is no such floor");
                break;
        }


    }
}
