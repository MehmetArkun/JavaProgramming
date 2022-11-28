package day11_Switch_Scanner;

public class CharGrade {

    public static void main(String[] args) {

        char grade = 'Z';

        switch (grade){

            case 'A':
                System.out.println(grade + ": excellent");
                break;

            case 'B':
                System.out.println(grade + ": great job");
                break;

            case 'C':
                System.out.println(grade + ": good");
                break;

            case 'D':
                System.out.println(grade + ": passed");
                break;

            case 'F':
                System.out.println(grade + ": failed");
                break;

            default:
                System.out.println("invalid");
                break;

        }


    }
}
