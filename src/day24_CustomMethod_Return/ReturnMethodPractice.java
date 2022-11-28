package day24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        //find the max number between 100 & 200
        // multiplay the max number by 2

        int maxN = max(5,6);

        System.out.println(maxN * 2);




    }

    public static int max(int number1, int number2) {

        int maxNumber;

        if (number1 > number2) {
            maxNumber = number1;
        } else {
            maxNumber = number2;
        }

        return maxNumber;

    }

}
