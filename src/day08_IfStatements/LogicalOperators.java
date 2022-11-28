package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        //&& when we have two conditions to express with boolean data type

        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >=18 && citizen =="UK";

        System.out.println(name + " is eligible to vote: " + isEligible);

        // we use && when we have to validate two conditions to be checked by boolean dataype
        // both expression must be true to get true output

        String name2 = " Josh";

        int creditScore = 720;
        int age2 = 23;
        int income = 40000;

        boolean isEligible2 = creditScore >= 720 && age2 >= 21 && income >= 60000;
        System.out.println(name2 + " is eligible for loan: " + isEligible2);


        System.out.println("---------------------------------------------");

        //  || as long as there is one true then output is true

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3>=18 && (gender == 'F' || gender == 'M');
                            //21>18   &&   ( 'F' == 'M'   || 'M' == 'M')
                           // True         (     False         True)
                            // True  &&    True

        System.out.println(name3 + " is eligible to register: " + isEligible3);

        System.out.println("------------------");

         String name4 = "James";
         String countryOfBirth = "UK";
         boolean marriedToUSCitizen = false;

         boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
         //                                         false        false

        System.out.println(name4 + " is eligible for US citizenship = " + isEligible4);

        String student = "Ali";
        double gpa = 2.5;
        int familyIncome = 50000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(student + " is eligible for scholarship: " + isEligible5);


        // we use ! not logical opera, it gives the opposite value

        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        int score =85;
        boolean passed = score>=60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        //




    }
}
