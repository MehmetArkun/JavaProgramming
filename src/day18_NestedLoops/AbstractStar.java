package day18_NestedLoops;

public class AbstractStar {

    public static void main(String[] args) {

        String star = "* ";
        String result = "";

        for (int j = 0; j < 2; j++) {

            for (int i = 0; i < 5; i++) {

                System.out.println(result);
                result += star;

            }
        }
    }
}

/*

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 * * * * * * * *
 * * * * * * * * *
 * * * * * * * * * *

 */