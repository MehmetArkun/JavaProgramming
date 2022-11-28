package day04_Variables;

public class GallonsToLitters {

    public static void main (String [] args){

        int gallon = 10_000;
        double litter = gallon * 3.79;

        System.out.println("gallon = " + gallon);
        System.out.println("litter = " + litter);

        String topic1 = "Java";
        String topic2 = "SQL";

        System.out.println ("I will learn " + "\"" + topic1 +  " and " + "\"" + topic2 + "\"" + " at CybertekSchool.");

        int hour, minute, second;
        hour = 11;
        minute = 15;
        second = 45;

        String amOrPm = "(\"AM\" or \"PM\")";

        System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);







    }
}

/*
5. Create a class named GallonsToLitters, Write a program that can convert gallon (int) to litter (double)
					Hints: 1 gallon = 3.79 litters
 */
