package day37_Inheritance.animalTask;

public class Cat extends Animal{

    //when we first write the name of the class and add extends keyword, it gives error
    //this is because we have constructor method (not default) in parent class
    //if we click on angry ak party logo, it suggests that we create a constructor matching super

    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }
}
