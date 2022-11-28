package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Please enter your name kindly");
        String name = input.nextLine();

        System.out.println("Please enter your building number kindly");
        String building = input.next();

        input.nextLine();

        System.out.println("Please enter your street name");
        String street = input.nextLine();

        System.out.println("Please enter your city name kindly");
        String city = input.nextLine();

        System.out.println("Please enter your state name kindly");
        String state = input.next();
        input.nextLine();

        System.out.println("Please enter your zip code kindly");
        String zipCode = input.nextLine();

        String address = "\n" + name + "\n" + building + ", " + street + "\n"
                + city + ", " + state + ", " + zipCode;

        System.out.println("address = " + address);






    }
}

/*
enter your full name nextLine()
enter your building number next()
enter your street name netLine ()
enter your city name nextLine()
enter your state name next()
enter your zip code

display the shipping address

 */