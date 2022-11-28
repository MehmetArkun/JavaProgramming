package day45_Abstraction_Interface_Continue;

import day45_Abstraction_Interface_Continue.shape.Circle;
import day45_Abstraction_Interface_Continue.shape.Shape;

public class Summary {

    public static void main(String[] args) {

        /*
        CLASS: blue print of objects. it specifies what object must have.
                can be instantiated (process of creating object)

        ABSTRACT CLASS: meant to be parent so that it can contain common feautres of sublcasses.
        speficies all the common features of child classes.
        we can achieve abstraction. state of being raw. can have abstract methods that are without body.
        they allow us to focus on the essentials, ignore small details. can not be instantiated. has to be inherited.
        can not be final.

        INTERFACE: it is to provide additional methods. it is not a class.
        blueprint of class. it can help us specify what classes must have.
        can not be instantiated. they are here to achieve 100% abstraction. to achieve that we need iheritance.
        can not be final since it needs to be inherited.
        to provide additional methods that any class needs

        what interface can have?
        variables: static final variables
        methods: abstract method, static method, default method.
        access modifier: only public

        what interface can not have?
        instance variable (need object for that)
        instance methods  (need object for that)
        constructor (need object for that as it is used for obkject creatiion)
        blocks

        why we need interface?
        one class can extend one class only
        one class can implements multiple interfaces

        Abstract class vs Interface
            -both are used for achieving abstraction
            both can not be instantiated
            both can not be final
            both are meant to be inherited

            abstract class: one class can extends one abstract class
                            can have instances & statics
                            can have constructor

        Interfaces can also extend each other, meaning they can inherit from each other.
        type must be the same

        class extends class
        interface extends interfaces





















         */


    }
}
