package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {

        oddOrEven(2);

        ageOfPerson(1965);

        printNumbers(4,10);

    }

    //create a fucntion that can check if a number is odd numver  or even nubmer

    public static void oddOrEven(int number){

        if(number%2==0){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number + " is an odd number");
        }


    }

    //create a function that can display the age of the person

    public static void ageOfPerson(int birthYear){

        int age = 2022 - birthYear;

        System.out.println("your age is " + age);

    }

    // create a function that can print all the numbers between x and y
    public static void printNumbers(int x, int y){

        for (int i = x; i <=y ; i++) {
            System.out.println(i);
        }

    }

}
