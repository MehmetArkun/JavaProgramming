package day24_CustomMethod_Return;

public class WarmUpTasks {

    public static void main(String[] args) {

        initials("mehmet", "arkun");
        System.out.println("-------------------");

        domain("mehmetarkungb@gmail.com");
        System.out.println("-------------------");

        month(2);
        System.out.println("-------------------");

        day(6);
        System.out.println("-------------------");

        String [] emails = {"josh@gmail.com" , "Jim@yahoo.com" , "Elminur@cydeo.com" , "gulsen@gmail.com"};

        for (String eachEmailElements : emails) {
            domain(eachEmailElements);
        }

    }

    //1. Create a method that can display the initials of the person
    public static void initials(String name, String surname) {

        String initial = name.charAt(0) + "." + surname.charAt(0) + ".";
        initial = initial.toUpperCase();
        System.out.println(initial);
    }

    //	2. Create a method that can display the domain of the email
    public static void domain(String email) {
        String domainOfEmail = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        System.out.println(domainOfEmail);
    }

    //	3. Create a method that can display the name of the month based on the given number to the method
    public static void month(int numberOfMonth) {

        if (numberOfMonth > 0 && numberOfMonth < 13) {

            switch (numberOfMonth) {

                case 1:
                    System.out.println("January");
                    break;

                case 2:
                    System.out.println("February");
                    break;

                case 3:
                    System.out.println("March");
                    break;

                case 4:
                    System.out.println("April");
                    break;

                case 5:
                    System.out.println("May");
                    break;

                case 6:
                    System.out.println("June");
                    break;

                case 7:
                    System.out.println("July");
                    break;

                case 8:
                    System.out.println("August");
                    break;

                case 9:
                    System.out.println("September");
                    break;

                case 10:
                    System.out.println("October");
                    break;

                case 11:
                    System.out.println("November");
                    break;

                case 12:
                    System.out.println("December");
                    break;
            }

        }else {
            System.out.println("Invalid number of Month. " +
                    "Please enter bigger than 0 and smaller than 13");
        }


    }


//	4. Create a method that can print the name of the day based on the given number to the method
    public static void day (int numberOfDay){
        if (numberOfDay > 0 && numberOfDay < 8) {

            switch (numberOfDay) {

                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;

                case 5:
                    System.out.println("Friday");
                    break;

                case 6:
                    System.out.println("Saturday");
                    break;

                case 7:
                    System.out.println("Sunday");
                    break;

            }

        }else {
            System.out.println("Invalid number of Day. " +
                    "Please enter bigger than 0 and smaller than 8");
        }
    }




}

/*
1. Create a method that can display the initials of the person
	2. Create a method that can display the domain of the email
	3. Create a method that can display the name of the month based on the given number to the method
	4. Create a method that can print the name of the day based on the given number to the method
	5. Create a method that can print how many days a month has
    6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
                        */