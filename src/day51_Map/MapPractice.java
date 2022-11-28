package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        //  1. Update the "M" to Male and "F" to Female
            /*
        for (String eachKey : employeeMap.keySet()) {
            String eachValue = employeeMap.get(eachKey);
            if (eachValue.equalsIgnoreCase("M")){
                employeeMap.replace(eachKey,"Male");
            }

            if (eachValue.equalsIgnoreCase("F")){
                employeeMap.replace(eachKey,"Female");
            }
        }

        System.out.println("employeeMap = " + employeeMap);

 */ // first solution

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equalsIgnoreCase("M")){
                eachEntry.setValue("Male");
                //employeeMap.replace(eachEntry.getKey(), "Male");

            }

            if (eachEntry.getValue().equalsIgnoreCase("F")){
                eachEntry.setValue("Female");
                //employeeMap.replace(eachEntry.getKey(), "Female");

            }
        }

        System.out.println();

        //2 Display the names of all female employees

        for (String eachKey : employeeMap.keySet()) {
            String eachValue = employeeMap.get(eachKey);
            if (eachValue.equalsIgnoreCase("Female")){
                System.out.println(eachKey);
            }
        }

        System.out.println("");
        System.out.println("Second Solution:");
        System.out.println("");

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equalsIgnoreCase("Female")){
                System.out.println(eachEntry.getKey());
            }
        }

    }
}
