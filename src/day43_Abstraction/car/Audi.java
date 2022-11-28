package day43_Abstraction.car;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    public void start () {
        System.out.println(getMake() + " is starting");
    }

    public void stop () {
        System.out.println(getMake() + " is stopping");
    }

    public void autoPark () {
        System.out.println("Twist ket to ignite");
    }
}
