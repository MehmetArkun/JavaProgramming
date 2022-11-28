package day44_Abstraction_Interface.animalTask;

public final class Dog extends Animal implements Playable{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    //since name variable is private in parent class, it is not inherited actually
    //we can call it via get method to the child class because setter method is public

    public final void bark() {
        System.out.println(getName() + " is barking");
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }


    @Override
    public void play() {//override ederken public ettik cunku ya ayni olmasi lazim ya da more visible olmasi lazim
        System.out.println(getName() + " is playing with ball");
    }



}
