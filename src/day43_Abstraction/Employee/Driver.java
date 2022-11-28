package day43_Abstraction.Employee;

public final class Driver extends Employee{
    public Driver(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving so fast");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping while driving");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating petrol station food");
    }
}
