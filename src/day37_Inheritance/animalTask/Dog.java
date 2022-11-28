package day37_Inheritance.animalTask;

public class Dog extends Animal{

    //if the parent class has default constructor, child class calls constructor implicitly
    //if the parent class has custom constructor method, then we have to call the constructor method via super() keyword
    //to do it, we have to create a constructor inside the child class, then we should use super() inside of that constructor
    //because, a constructor can only be called from within another constructor.

    public Dog (String name, String breed, String size, String color, char gender, int age){
        super(name, breed, size, color, gender, age);
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

}
