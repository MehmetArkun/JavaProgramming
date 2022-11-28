package day43_Abstraction.Employee;

public final class Tester extends Employee{
    //I made it final so that dev team can not inherit tester methods etc


    @Override
    public void work() {
        System.out.println(getName() + " is testing the application");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping during smoke testing");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats 8 burgers");
    }

    public void bugReport (){
        System.out.println(getName() + " is creating bug reports");
    }

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }
}
