package day39_Recap.cydeoTask;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, String employeeId, double salary) {
        super(name, age, gender, employeeId, "Tester", salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is working");    }

    public void createTicket(){
        System.out.println(getJobTitle() + " " + getName() + " is creating ticket");    }




    }



/*
3. Create a sub class of Employee named Tester
            Override the work method
            Extra methods:
                createTicket()
 */
