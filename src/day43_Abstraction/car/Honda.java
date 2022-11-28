package day43_Abstraction.car;

public final class Honda extends Car{
    //final yaptim bu classi, baska classlar child iddiasinda olmasin, sen benim babamsin deyip mirasa konmasin diye

    public Honda(String model, String color, int year, double price) {
        super("Honda" , model, color, year, price);
    }

    public void start (){
        System.out.println("Twist the key to ignite");
    }

    public void stop () {
        System.out.println("Twist the key to ignite");
    }



















}
