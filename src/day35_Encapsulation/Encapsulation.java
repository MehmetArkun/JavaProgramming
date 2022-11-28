package day35_Encapsulation;

public class Encapsulation {

    //encapsulation one of the 4 object oriented programming principles

    //OOP: a design pattern of apps in an organized and modular manner
    //your codes your apps will be much more organized and in centralized structure if you apply OOP
    //oop avoids duplication (instead of writing a code for thousands of time)
    //it allows the usage of features of different classes
    //by using oop we can use the same feature for different classes
    //app will be maintainable
    //you can go to one place to change something, and it can change the whole
    //less memory usage

    public static void main(String[] args) {
        System.out.println("ECAPSUALTION");

        //HIDING THE OBJECT FROM THE INTERNATL DATA THATS OUTSIDE THE CLASS
        //ONLY CURRENT CLASS' METHODS CAN DIRECTLY ACCESS AND MAKE CHANGES TO INSTANCE VARIABLES
        //HIDE AN INSTANCE VARIABLE BY GIBING PRIVATE ACCESS MODIFIER AND MAKING THE METHODS THAT ACCESS THOSE FIELDS PUBLIC
        //THESE PUBLIC METHODS ARE CALLED GETTERS AND SETTERS (ACCESSOR AND MUTATOR)

        System.out.println("GETTER METHOD");

        //instance return method that returns private instance variable
        //does not pass any parameter
        //return type must watch with the data type of private instance variable

        System.out.println("SETTER METHOD");
        //the method with the return type void which sets changes the private data value with the parameter
        //parameter type and private data type must match




    }
}
