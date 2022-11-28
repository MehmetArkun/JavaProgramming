package Day52_Map_Functional_Interface;

// lambda: () -> {}

public class Test {

    public static void main(String[] args) {

        //fucntion 1 : create a function that can displat a number is odd or even

        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if(n%2==0){
                System.out.println(n + " is even");
            }else {
                System.out.println(n+" is odd");
            }
        };

        oddOrEvenNumber.apply(2);

        //f2: create a funct that can check if a person is eligible to buy alchol

        MyFirstFunctionalInterface eligibleToBuyAlcohol;
        eligibleToBuyAlcohol = (age) -> {
            if (age>=21){
                System.out.println("eligible to buy alcohol");
            }else {
                System.out.println("not eligible");
            }
        };

        eligibleToBuyAlcohol.apply(28);





        //f3: create a fucntion that can display the cube of a number
        MyFirstFunctionalInterface cubeOfANumber;
        cubeOfANumber = (number) -> {
            System.out.println("cube of the number = " + number * number * number);
        };

        cubeOfANumber.apply(3);

        //f4: create a funct that can check if a number is evenly divisible by 3&5

        MyFirstFunctionalInterface divisible3and5;
        divisible3and5 = number -> {

            if (number%15==0){
                System.out.println(number + " is divisible by 3 and 5");
            }else {
                System.out.println("not divisible");
            }

        };

        divisible3and5.apply(45);


    }
}

//implementation will be decided via the reference name I use while calling the method
