package day43_Abstraction.Employee;

public abstract class Employee extends Person {

    //asagiya gitmeden once sunu hatirlamakta fayda var
    //bu class abstract. bu classin parenti de abstract.
    //o yuzden parent classtaki metodu buraya override etmeye gerek yok
    //abstract class lar baska abstract clasin metodunu inherit edebilir without overriding

    private final int id;
    private String jobTitle;
    private double salary;

    public abstract void work();

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        if (id<=0){
            throw new RuntimeException("Invalid ID: " + id);
        }
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name= " + getName() +
                "age= " + getAge() +
                "gender= " + getGender() +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
