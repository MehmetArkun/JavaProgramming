package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        // now I can set the attributes of this object.
        //in order to accesss the methods(action) and fields(attributes) of the object, we gotta use
        //dot operation
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        Dog dog2 = new Dog(); // now instance variables are copied as I created this object
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 2;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large,", "White");
        //bunun icin dog class'ta method olusturduk instance variablelara girdigimiz paramterleri direk atasin diye
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");

        System.out.println("-------------------------------------------------------------------------------------------");

        Dog [] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();
        
        femaleDogs.addAll(Arrays.asList(dog1, dog2, dog3, dog4, dog5));
        femaleDogs.removeIf(p-> p.gender=='M');

        maleDogs.addAll(Arrays.asList(dog1, dog2, dog3, dog4, dog5));
        maleDogs.removeIf(p-> p.gender=='F');

        System.out.println("females: " + femaleDogs);
        System.out.println("males: " + maleDogs);

    }
}
