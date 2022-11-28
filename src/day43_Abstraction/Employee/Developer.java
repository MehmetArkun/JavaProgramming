package day43_Abstraction.Employee;

public final class Developer extends Employee{


    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding to develop the app");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping while testers are working");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating all the burgers and not leaving any for testers");
    }
}
