package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John",'M',25,2237,"Developer",100000,true);
        employee2.setInfo("Anna",'F',28,2287,"QA",85000,true);
        employee3.setInfo("David",'M',35,2256,"QA",45000,false);
        employee4.setInfo("Lina",'F',45,2290,"Manager",80000,true);
        employee5.setInfo("Kevin",'M',35,2298,"Senior QA", 110000,true);

        Employee [] employees = {employee1,employee2,employee3,employee4,employee5};
        ArrayList<Employee> employeesList = new ArrayList<>(Arrays.asList(employees));

        int countFullTime = 0;
        int countPartTime = 0;
        for (Employee eachEmployee : employees) {
            if (eachEmployee.isFullTime){
                countFullTime++;
            }else {
                countPartTime++;
            }
        }
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);

        double minSalary = employeesList.get(0).salary;
        double maxSalary = employees[0].salary;

        for (Employee eachEmployee : employees) {
            if (eachEmployee.salary<minSalary){
                minSalary=eachEmployee.salary;
            }

            if(eachEmployee.salary>maxSalary){
                maxSalary=eachEmployee.salary;
            }
        }

        System.out.println("maxSalary = " + maxSalary);
        System.out.println("minSalary = " + minSalary);



    }
}
