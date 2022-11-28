package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setInfo("Max", "Husky", "Small", "White", 'M', 2);

        dog1.eat();
        dog1.drink();
        dog1.sleep();
        dog1.move();
        dog1.bark();

        Cat cat1 = new Cat ();
        cat1.setInfo("Tarcin", "British", "Small", "Brown", 'M', 3);

        cat1.eat();
        cat1.sleep();
        cat1.move();
        cat1.drink();

        Tiger tiger1 = new Tiger();
        tiger1.setInfo("Sher Khan", "Bengal", "Large", "Orange", 'M', 4);

        tiger1.eat();
        tiger1.drink();
        tiger1.hunt();
        tiger1.roar();
        tiger1.sleep();
        tiger1.move();


    }
}
