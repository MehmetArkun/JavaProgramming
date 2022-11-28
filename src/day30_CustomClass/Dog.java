package day30_CustomClass;

public class Dog {
    //we creataed the class

    public String name; // this is one instance variable.
    //if we create 10 dffirerent objects, 10 of them will have a seperate copy of this instance variable

    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;
    //these are the attributes needed for every signle objects.

    //besides attributes, objects need methods, actions.

    public void setInfo (String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColour){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColour;

    }

    public void eat(){
        System.out.println(name + " is eating" );
    }

    public void bark(){
        System.out.println(name + "is barking");
    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    //eger static yaparsak specifier'i, tek bir kopya olusturur.
    //sonrasinda da o methodu cagirdigimizda butun objectler o methodu uygular. hepsi havlar.
    //instance yaparsak methodu sadece cagirdigmiz object methodu uygular
    //static keyword yok, obur turlu intance olmaz. static koyarsak tek bir kopya olur
    //this dog is going to be the custom class
    //lets assume we will have 10 different objects in this class
    //then we will have different attiributes in this class

    // object olustrabiliriz artik

    // we do not need main methods inside custom classes.
    //because they are just meant for creating the objects
    //they are not meant for running the class


    /*
    Attributes:
    name, age, gender, breed, size, colour

    Actions:
    eat(), play(), bark(),

    if we create these variables as instance variables, each object can have their own copy of them

 */



}


