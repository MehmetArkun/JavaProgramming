package day06_PrimitiveTypeCastings;

public class BirthDay {

    public static void main(String[] args) {

        String name = "Mehmet Ali",
                birthMonth = "February";

        int birthDay = 19,
                birthYear = 1989;

        String birthDayInfo = name + " was born on " +
                birthMonth + "/" + birthDay + "/" + birthYear + ".";

        System.out.println(birthDayInfo);

        System.out.println("--------------------------------------");


        //My favourite book is "bookName"
        String bookName = "The Critique of Pure Reason";

        System.out.println("My favourite book is \"" + bookName + "\"");



    }


}
/*
    Create a class named BirthDay and create the following variable
        name, birthDay(int), birthMonth(String), birthYear(int)
        use concatenation to display the birthday of the person
        if  name = "John"
        birthDay = 25
        birthMonth = "April"
        birthYear = 1995;
        output:
        John was born on April/25/1995.

 */