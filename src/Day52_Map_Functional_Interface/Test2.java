package Day52_Map_Functional_Interface;

public class Test2 {

    public static void main(String[] args) {

        //function: create a function that can print each

        MySecondFunctionalInterface<String> printEach;

        printEach = s -> {
            for (String each : s.split("")) {
                System.out.println("each = " + each);
            }
        };

        printEach.test("Wooden Spoon");

        MySecondFunctionalInterface<Integer> cube;

        cube = n -> {
            System.out.println("cube: " + n * n * n);
        };

        cube.test(5);











    }
}
