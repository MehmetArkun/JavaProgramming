package day31_Constructors;

public class RectangleObjects {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5.5,3.5);
        Rectangle rectangle2 = new Rectangle(10.5,8.5);
        //if you create two objects, constructer gets executed twice

        System.out.println(rectangle1);
        System.out.println(rectangle2);

        double area = rectangle1.calculateArea();
        System.out.println(area);


    }
}
