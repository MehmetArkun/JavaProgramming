package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        //if: (condition)?
        //else: :
        //else-if: :(condition)?

        int n = 100;

        if (n % 2 == 0) {
            System.out.println("Even"); // String

        } else {
            System.out.println("Odd"); // String
        }

        // So, each statement within block is same: String
        // So, we can use Ternaries instead of regular if statement

        System.out.println("-----------------------");

        String result1 = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println(result1);

        System.out.println("-----------------------");


        int age = 23;

        String isEligible = (age >= 21) ? "Eligible" : "Not Eligible";

        System.out.println(isEligible);
        
        /*

        if(age>=21){
        System.out.println("Eligible"); // String
        }else{
        System.out.println ("Not Eligible"); // String
        }

         */

        System.out.println("----------------");

        int number = 100;
        /*
        if(number>0){
            System.out.println("Positive");
        } else if (number<0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
      
      */

        String result3 = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
//we can also erase paranthesis within ternaries. paranthesis is optional
        System.out.println("result3 = " + result3);
    }
}
