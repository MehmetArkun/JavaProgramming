package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 400;

        if (score>=0 && score<=100){//this is pre-condition

            if (score >= 60) {//if&else or multibranch ifs are inside pre-condition if
                System.out.println("Pass");
            }else {
                System.out.println("Failed");

            }

        }else{//else is outside of pre-condition and it bleongs to the pre-condition.
            // it renders it.yani onunla alakali.
            System.out.println("Score is invalid");
        }

        System.out.println("----------------------------------");

        int age = 25;
        boolean hasId = true;

        if (hasId){

            if (age>=21){
                System.out.println("Eligible to buy Alcohol");
            }else{
                System.out.println("Not eligible to buy alcohol");
            }
        }else {
            System.out.println("You must have id to buy alcohol");
        }

    }
}
