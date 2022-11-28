package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        //1 who has the maximum salary

        String name1 = "";

        int maxSalary = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue()>maxSalary){
                maxSalary= eachEntry.getValue();
                name1=eachEntry.getKey();
            }

        }
        System.out.println(name1 + " has the maximum salary");

        //2 minimum salary

        int minSalary = Integer.MAX_VALUE;
        String employeeWithMinSalary = "";

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue()<minSalary){
                minSalary= eachEntry.getValue();
                employeeWithMinSalary=eachEntry.getKey();
            }

        }
        System.out.println(employeeWithMinSalary + " has the minimum salary");

        System.out.println("-----------------------------------------------");

        //how many employees has the salary between 120k ~ 150K?

        int numberOfPeopleHaving120150 = 0;

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue()>=120000 && eachEntry.getValue()<=150000){
                numberOfPeopleHaving120150++;
            }
        }

        System.out.println("count = " + numberOfPeopleHaving120150);

        System.out.println("-------------------------------------");

        //displat the names of employees having less than 118k

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {

            if (eachEntry.getValue()<118000){
                System.out.println("employees having less than 118k: " + eachEntry.getKey());
            }

        }

        System.out.println("-------------------------------------------------------------------");

        //Increase the salary employee by 10k if the current salary of employee is less than 120k


        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) { //map.entrySet().for


            if (eachEntry.getValue()<120000){
                map.replace(eachEntry.getKey(),eachEntry.getValue()+10000);
                //entry.setValue(entry.getValue()+10000);
            }
        }

        System.out.println(map);
        System.out.println("---------------------------------------------------------------------------");








    }
}
