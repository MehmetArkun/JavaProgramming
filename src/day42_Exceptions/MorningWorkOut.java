package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("--------------Push up started------------");

        for (int i = 1; i <= 30; i++) {

            System.out.print("\rPush up " + i + " started");
            //with this \r excape sequence, I am able to print all the statements in one line
            sleep(1.5);

            /*
            try{
                Thread.sleep(150);
            }catch (InterruptedException e){
                e.printStackTrace();
            }//catch block is for the exceptions occuring during the runtime

             */

        }

        System.out.println("----------------Push Ups Completed--------------------");

        System.out.println("----------------Pull Ups Started---------------------");

        for (int i = 1; i <=20 ; i++) {
            System.out.print("\rPull up " + i + " started");

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        System.out.println("\n------Pull ups Completed");




    }


    public static void sleep (double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // we created our own sleep method so that we can avoid handling with try and catch blocks each time
    // bu arada long'a cast ettik range tuttsun diye
    // paranteze aldik ki 1000 ile carptiktan sonra long casting olsun
    //obur turlu double'i long a cast ettiginde decimal gidiyor


}
