package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer> numbers = new ArrayList<>();
    //it takes more than one step to set this static variable.
    // therefore we gotta set in static block

    public Circle(double radius){
        this.radius=radius;
        //pi = 3.14; -> initializing the static
        //if I put static inside constructor
        //meaning if I use constructor to set static, it will initilaize static for whatever times we call constructor via objects
        //if static is inside constructor, wheneever you create an objcet, it will repeat the static as well, which is unnecessary
        //therfore, static variable gotta be in static block
    }


    static{
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }

/*
    public static void main(String[] args) {
        // main method also accepts static variables and static method as it is a static block
        //but never get executed outside of circle class
        //main methods runs only in class, it can not run outside of class

        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);


    }

 */



}
