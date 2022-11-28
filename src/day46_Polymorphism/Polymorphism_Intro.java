package day46_Polymorphism;

public class Polymorphism_Intro {

    /*
    Literal meaning: Many Forms
    -ability of object to take many forms
    -Inheritance is a must for PM to occur.
    -occurs when reference type is parent class/interface and the object is child.
    -when reference type refers to many different object types, it is called polymorphism
    -only the methods in reference type can be called
    -when we call a method it will call overrideen version from child class
    -if method is not overridden it will cal parent super class version
    -if there is implementation of the method in child class, then the method will be called from child
    -you can not call methods that dont exist in parent class
    -so the method is called from reference type, if there is implementation in child, then it will come.
    -method must be the property of reference type.
    -reference type decides what is accessible
    -objet type decides which implementation of the method to be executed when the method is called
    -to verify whether the object is a certain class (to where it is being referred), we use instance of keyword
    -it returns boolean result

    example:
        Shape shape1 = new Rectangle();
        boolean isRectangle = shape1 instanceof Rectangle; --> true
        boolean isSquare = shape1 instanceof Square; --> false
        boolean isTriangle = shape1 instanceof Triangle; --> false


     */

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        Integer n1 = 2;
        Boolean r1 = true;
        Double b2 = 5.5;

        //what if I wanna store values in one type. What if I dont wanna remember their data types one by one.

        Object [] array = {str, n1, r1}; // <-----
        // Object yazan yerde ilk basta string yaziyordu. String arraye koymaya calistim
        //olmadi, error verdi. ama javada her bir classin parent classi Object classi oldugundan, Object'i oraya koydum.
        //calsiti. yani inheritance oldugundan, is a relation oldugundan, polymorphism oldu, o farkli data typelari tek bir
        //array icine koyabildim.

        /*



         */


    }
}
