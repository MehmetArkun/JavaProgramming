package day35_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private int age;
    private char gender;
    private double salary;

    public Employee(String name, int age, char gender, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        setSalary(salary);
    }

    public void setName(String name){
        if (name.isEmpty()){
            System.err.println("Invalid Name");
            System.exit(0);
        }
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if (age<16 || age>90){
            System.err.println("Invalid Age");
            System.exit(0);
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setGender(char gender){
        if (!(gender=='M' || gender =='F')){
            System.err.println("Invalid Gender");
            System.exit(0);
        }
        this.gender = gender;
    }
    public char getGender(){
        return gender;
    }

    public void setSalary(double salary){
        if (salary<=0){
            System.err.println("Invalid Saalry");
            System.exit(0);
        }
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

}
