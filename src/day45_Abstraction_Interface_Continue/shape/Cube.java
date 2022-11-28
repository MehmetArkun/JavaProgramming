package day45_Abstraction_Interface_Continue.shape;

public class Cube extends Shape implements Volume{


    public Cube(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
