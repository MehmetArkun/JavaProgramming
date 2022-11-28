package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        //break statement stops the switch and loops
        //continue skips given particular iteration

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                continue;
            }

            System.out.println(i);
        }

        System.out.println("---------------------");
//print even numbers
        for (int i = 1; i <= 10; i++) {

            if (!(i % 2 == 0)) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("--------------");
//print odd numbers
        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
