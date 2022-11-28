package day19_LoopsPractises;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if (i == 3){
              //  break; terminates the loop
                // continue; terminates the current iteration of the loop

                System.exit(0);//terminates the whole program once condition is true
            }
            System.out.println(i);
        }



    }
}
