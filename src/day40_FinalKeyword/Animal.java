package day40_FinalKeyword;

public class Animal {

    private String name;
    private final String breed;
    private final String gender;
    private final String color;

    private String size;
    private int age;

    // it gives error first you declare final because
    // it wants to make sure that you set them by the time you first use them
    //if you generate constructor, then it will fade away.

    public Animal(String name, String breed, String gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    // since the ultimate goal of setter is to change a variable,
    // you can not generate a setter for final variable


    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public String getGender() {
        return gender;
    }
    public String getColor() {
        return color;
    }
    public String getSize() {
        return size;
    }
    public int getAge() {
        return age;
    }
//--------------SETTERS---------------------------------
    public void setName(String name) {
        this.name = name;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //----------------FINAL METHODS-----------------------

    //final methods can not be overridden as final methods are meant not to be changed

    public void eat () {
        System.out.println(name + " is eating");
    }

    public final void drink (){
        System.out.println(name + " is drinking");
    }




}
