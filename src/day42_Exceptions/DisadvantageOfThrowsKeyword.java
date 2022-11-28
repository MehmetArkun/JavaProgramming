package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args) {

        System.out.println("Hello");

       // sleep(2.5);
        // kendi olusturdugumuz sleep methodu dahi kullanamaiyoruz cunku throws keyword ile olusturduk
        //main methoda throws yazsaydik bu sorunla karsilasmayacaktik

        System.out.println("Hello World");

        System.out.println("--------------------------------");


        System.out.println("Hello");
    }


        public static void sleep (double seconds) throws InterruptedException {
                Thread.sleep((long) (seconds * 1000));

        }




    }

