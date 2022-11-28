package day45_Abstraction_Interface_Continue.shape;

public class Circle extends Shape {

    private double radius;

    public final static double pi = 3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new RuntimeException("Invalid Radius");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+//parent classin tostring methodunun icindekileri teker teker yazmak yerine super ile cagirdik
                "radius=" + radius +
                '}';
    }
}
