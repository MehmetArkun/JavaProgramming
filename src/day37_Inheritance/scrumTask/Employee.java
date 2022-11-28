package day37_Inheritance.scrumTask;

public class Employee extends Person{ // Employee IS A Person --> "is a" relation
    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(jobTitle+" "+name + " is working");
    }

    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
    //apart from the toString method we used in parent class, we also created a toString method here
    //so that we can see new variables we created here in the console while printing
}
