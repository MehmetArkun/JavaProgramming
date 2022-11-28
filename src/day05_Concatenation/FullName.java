package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Carl";
        String lastName = "Sagan";
        int age = 45;
        String jobTitle = "Astrophysicist";
        String companyName = "Nasa";
        String fullName = firstName +" " + lastName;
        double salary = 100000.58;

        //Full name of the person is ____
        System.out.println("Full name of the person is " + fullName);

        //___ is ___ years old.
        System.out.println(fullName +" is "+age+" years old.");

        //FullName is jobTitle, works at companyName, and fullName's salary is salary

        System.out.println(fullName + " is "+jobTitle+", works at "+companyName
                +", and "+fullName+"'s salary is $"+salary);


    }


}
