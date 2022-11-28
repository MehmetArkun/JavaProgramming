package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", "Small", "White", 'M', 1);
        System.out.println(dog1);

        Cat cat1 = new Cat ("Kitty", "Tekir", "Medium", "Grey", 'M', 3);
        System.out.println(cat1);

        Parrot parrot1 = new Parrot("King", "Macaw", "Small", "Green", 'M', 3,"Red");
        System.out.println(parrot1);
    }
}
