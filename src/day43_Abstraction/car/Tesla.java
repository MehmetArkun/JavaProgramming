package day43_Abstraction.car;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    public void start () {
        System.out.println(getMake() + " is starting");
    }

    public void stop () {
        System.out.println(getMake() + " is starting");
    }


}
