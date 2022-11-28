package week06;

public class FibonacciAgain {

    public static void main(String[] args) {


        int maxNumber = 6;    //how many times loop will work
        int previousNumber = 0;
        int nextNumber = 1;

        for (int i = 0; i <= maxNumber; i++) {

            System.out.print(previousNumber);
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;

        }
    }
}
