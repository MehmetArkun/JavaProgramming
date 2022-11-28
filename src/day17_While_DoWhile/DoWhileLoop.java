package day17_While_DoWhile;

public class DoWhileLoop {

    public static void main(String[] args) {

        //we use while if dont now the repeat times
        //in do while, statement inside the block is executed before checking the the boolean expression inside our condition
        //after checkin, if its is true it continues, if it is false, it stops

        boolean a = false;

        for (int i=0; a;){
            System.out.println("Wooden Spoon -- for loop");
        }

        System.out.println("-------");

        while (a){
            System.out.println("Wooden Spoon-while loop");//never executes because it is false and while does not execute statements if condiuton is false
        }

        System.out.println("---------------");

        do{
            System.out.println("Wooden Spoon--do while loop");
        }while (a);


    }
}
