package day40_FinalKeyword;

public final class Dog extends Animal {
//I put final to dog so that it can not be a parent of other classes later on
    //via this, I made sure that for instance cat class can not extend to dog as cat would not
    //be able to utulize bark method belonging to dog

    public Dog(String name, String breed, String gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }

    // we overrode eat method as it is not final
    // we could not override drink method here as it is final

    public void bark() {
        System.out.println(getName() + " is barking");
    }
}
