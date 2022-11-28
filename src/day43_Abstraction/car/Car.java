package day43_Abstraction.car;

public abstract class Car {

    private final String make;
    private final String model;
    private String color;
    private final int year;
    private double price;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        setColor(color);
        if (year < 1886){
            throw new RuntimeException("Invalid Year: " + year);
        }//setter methodu olmadigi icin yearin, condition'i constructor icinde verdik
        this.year = year;
        setPrice(price);
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <=0){
            throw new RuntimeException("Invalid price: " + price);
        }
        this.price = price;
    }

    public abstract void start();

    public abstract void stop();
}
