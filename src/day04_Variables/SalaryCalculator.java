package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        //hourlyRate, weeklyHours

        int hourlyRate = 50;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyHours * numberOfWeeks;
        //* is the multiply sign

        System.out.println(salary);
        //soutv is the shortcut to print a variable
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = $" + weeklyHours);
        System.out.println("salary = $" + salary);








    }


}
