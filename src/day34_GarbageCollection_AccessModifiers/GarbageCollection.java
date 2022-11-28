package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day32_Constructor.Car;
import day31_Constructors.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        // garbage collection is a process run by JVM
        // it eliminates unreferenced objects
        // to make an object unreferenced, assign it to null, this is the fastest way
        // null is for non-primitive data types
        //other method is to assign obejcts to another object

        str = null;
        // now it ready for garbage collection

        System.out.println(str);

        Car car1 = new Car ("Toyota");
        System.out.println(car1);

        car1 = null;

        System.out.println(car1);

        // everysingle object has finalize method
        // everytime you reference with null, garbage collector calls finalize method car1.finalize();

        System.out.println("----------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

                //new Dog();//this dog object does not have reference, so it is ready for collection

        dog1 = new Dog(); // now first object is ready for collection

        System.out.println("---------------");

        String language = "Python";

                language = "Java";

                // python now is ready for collection

        System.out.println("-------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        //objects are like rooms
        list1.add(100);

        ArrayList<Integer> list2 = list1;
        //right now there is only one object here.
        //list1 and list2 share the same object right now

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);
        System.out.println(list2);
        //now since they share the same room, they have the elements
        //object is the room. list2 is like a door opening to list1

        System.out.println(list1 == list2);

        System.out.println("--------------------------------------");

        Student student1 = new Student("Tahir", 30,'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("-------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = l1;

        // you can reference one object to multipla names
        // you can not reference one reference name to multiple objects

        l1 = l2; // but here this is re-assigning
        //so object of l1 is gone to garbage

        //garbage collection: collection unreferenced objects
        //garbage collector is the tool doing this job


    }
}
