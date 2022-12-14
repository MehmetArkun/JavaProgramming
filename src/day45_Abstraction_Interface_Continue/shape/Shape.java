package day45_Abstraction_Interface_Continue.shape;

public abstract class Shape {

    private final String name;

    public String getName() {
        return name;
    }

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'';
    }
}
