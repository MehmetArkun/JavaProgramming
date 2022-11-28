package day39_Recap.cydeoTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String employeeId, double salary) {
        super(name, age, gender, employeeId, "Developer", salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is developing");    }

    public void fixingBugs(){
        System.out.println(getJobTitle() + " " + getName() + " is fixing the bugs");    }

    }


/*
4. Create a subclass of Employee named Developer
            Override the work method
            Extra methods:
                fixingBugs()
 */

