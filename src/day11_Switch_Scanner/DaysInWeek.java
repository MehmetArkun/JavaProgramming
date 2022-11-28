package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 11;

        switch (number){  //12345678          //cant be boulean long double float

            case 1: //data types of case and switch should also be same
                System.out.println("Monday");
                break; //in order to exit the switch statement so that next case blocks are not executed

            case 2:
                System.out.println("Tuesday");
                break;//exits the switch after executing the case block

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

            default:
                System.out.println("Invalid Day");
                break;
        }



    }
}
