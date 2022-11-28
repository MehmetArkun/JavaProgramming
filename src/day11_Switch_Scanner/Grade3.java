package day11_Switch_Scanner;

public class Grade3 {

    public static void main(String[] args) {

        char grade = 'D';
        String result = "";

        switch (grade){

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Passed";
                break;

            default:
                result="Failed";
                break;
        }

        System.out.println("result = " + result);


    }
}

/*
if the grade is A or B or C or D--->> "Passed"
otherwise failed
 */