package day32_Constructor;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender) {
        this.name = name; // this(name)
        this.gender = gender;
        //since we already used "name" in another constructor method, we can call it
        //we can it with this(name) keyword. we can not use regular call for regular methods.
    }

    public Employee(String name, char gender, String jobTitle) {
        this(name,gender);
        this.jobTitle = jobTitle;
    }

    public Employee (String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);
        this.salary = salary;
    }

}
