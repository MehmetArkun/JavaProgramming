package day47_Polymorphism;

import day43_Abstraction.Employee.Employee;
import day43_Abstraction.Employee.Tester;
import day44_Abstraction_Interface.animalTask.Animal;
import day44_Abstraction_Interface.animalTask.Cat;
import day44_Abstraction_Interface.animalTask.Dog;
import day45_Abstraction_Interface_Continue.shape.Circle;
import day45_Abstraction_Interface_Continue.shape.Shape;
import day45_Abstraction_Interface_Continue.shape.Square;

public class ReferenceTypeCastings {

    /*
    Primitive castings
        -Implicit Primitive type casting: castin smaller to large
            int a = 100;
            double b = a; -> int a is casted to double b (small to large)

        -Explicit Primitive Type Casting: casting large to small primitive type
            long a = 100;
            short b = (short)a; -> long a is casted to short b (large to small)
    ----------------------------------

    Reference Type Castings (Non-Primitive)
        -There must be INHERITANCE otherwise you will get ClassCastException

        -Upcasting: casting smaller to larger (subtype to supertype). Implicitly done.
                    allows us to achieve polymorphism without any explicit action

        -Downcasting: casting larger to smaller (supertype to subtype)
                      downcasting is done explicitly
                      it is done because it is the reference type that decides for which method to access
                      lets assume the reference type does not have the property, you need to change reference type
                      OR, you can do casting. thats why we implement dowcasting.

                      Employee employee = new Tester();
                      employee.testing(); --> you can not call testing method for employee since employee parent class does not have it

                      Animal animal = new Dog();
                      Dog dog = (Dog) animal; ->downcasting
                      dog.bark();

                      Animal animal = new Dog();
                      ((Dog)animal).bark; -> you can do like this since you are gonna use it one time no need vor variable



     */

    public static void main(String[] args) {

        Shape shape = new Circle(4);
        //the moment you create poly, implicit castin is happening in the backgroudn.
        //this is what makes PM possible. without castin, changing type is impossible.
        // so this is actually like this: Shape shape = (Shape)new Circle(4);
        //this is upcasting. child is casted to parent.


        Shape shape1 = new Square(5);

        System.out.println( ((Square)shape1).getSide());

        System.out.println("------------------------------------------------------------");


        Animal animal2 = new Cat("Jim", "Scottish", 'M', 3,"Small", "White");

        ((Cat)animal2).meow();
        ((Dog)animal2).bark(); // doesnt give check exception but it is gonna give unchecked exception
        //because that exception is thrown when there is no IS A relation between objects casted to each other
        //we downcasted animal to cat succesfully because there is a relation between them
        //however, there is no relation between dog and cat.

        System.out.println("---------------------------------------------");

        Employee employee = new Tester("Ali", 18, 'M', 23,"SDET", 56.000);

        ((Tester)employee).bugReport();



    }
}
