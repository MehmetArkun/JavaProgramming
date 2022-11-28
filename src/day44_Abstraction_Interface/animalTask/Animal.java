package day44_Abstraction_Interface.animalTask;

public abstract class Animal {
    //a class can not be both final and abstract

    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    //final olanlar compiler error veriyor cunku kullanmadan once onlara value assign etmek lazim
    //constructor burada olusturdugumuz vakit, bunun onune geciyoruz.


    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);//buraya this keyword de kullanabilirim. ama o zaman setter icinde kullandigimiz
        //conditionlar gecerli olmaz
        setAge(age);
        this.breed = breed;
        if(!(gender=='M'||gender=='F')){
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
        this.size = size;
        this.color = color;
    }//setter'i olmayan final methodlarin conditionlarini constructor icinde verebiliriz

    public final static boolean canBreath;

    static{
        canBreath = true;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            throw new RuntimeException();
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public final void drink () {
        System.out.println(name + " is drinking");
    }//we made it final so that it wont change again. every animal drinks you motherfucker

    public abstract void eat ();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +//this is the method we use to see class name everytime we create a child with string method isntead of parent
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
