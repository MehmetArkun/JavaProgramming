package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args){

        // age: 38 years old
        byte age = 38;

        // weight: 160 pounds
        short weight = 160;

        // salary: 100_000$
        int salary = 100_000;
        //int is the preffered datatype for integer datatypes (numbers)
        //we can use underscore _ to make numbers readable as java doesnt allow ,


        // asset: 3_333_333_333
        long asset = 3_333_333_333l;
        //use L or l at the end of variable syntax while using long datatype
        //if you dont use l or L compiler takes it as an int


        //tax: 0.26
        float tax = 0.26f;
        //double>float>long>int>short>byte

        //char is used for single characters, all of which equals to a number from 0 to 65,000
        // you need to give the character in single quote ie '#'

        char ch1 = '#';
        char ch2 = 34;
        char ch3 = 35_000;

        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        char grade = 'A';
        // whenever you have a single character as a data, then you will use char

        char yesNo = 'Y';
        // sometimes you have yes or no option in applications, you will use char for them as well

        boolean isEmployed = true;
        boolean isMarried = false;
        boolean result = 100>300;

        System.out.println("result = " + result);
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployed = " + isEmployed);

        String name = "Wooden Spoon";
        String city = "New York";
        String state = "New Austin";




    }
}
