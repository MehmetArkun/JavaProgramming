package day51_Map;

import java.util.*;

public class MapIteration_Methods {

    public static void main(String[] args) {

        //**************////Iteration via keys = keySet() = returns set //**************//

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali", 85);
        students.put("Alex", 80);
        students.put("Ozan", 75);
        students.put("Serkan", 70);
        students.put("Andriy", 98);

        Set <String> keys = students.keySet();
        /*
        for (String eachKey : keys) {
            students.get(eachKey);//returns the values of each key
            students.replace(eachKey, students.get(eachKey) + 5); // increasing the value of each key by 5

        }



 */

        //display all the students who make less than 90
        for (String eachKey : students.keySet()) {
            Integer eachValue = students.get(eachKey);

            if (eachValue<90){
                System.out.println(eachKey);
            }

        }


        // set angry and early birds
        Map<String, Integer> earlyBirds = new HashMap<>(); // score >= 90
        Map<String, Integer> angryBirds = new HashMap<>(); // score < 90

        for (String eachKey : students.keySet()) {
            Integer eachValue = students.get(eachKey);
            if (eachValue>=90){
                earlyBirds.put(eachKey, eachValue);
            }else {
                angryBirds.put(eachKey, eachValue);
            }

        }
        System.out.println("angryBirds = " + angryBirds);
        System.out.println("earlyBirds = " + earlyBirds);

        Set <String> names = students.keySet();

        System.out.println("---------------------------");

        //**************//Iteration via values = values() = returns collection ***********

        Collection<Integer> scores = students.values();
        System.out.println("scores = " + scores);

        List<Integer> scoresList = new ArrayList<>(students.values());
        // has index numbers

        System.out.println("--------------------------------------");

        // find out the max and min number

        int maxScore = Integer.MIN_VALUE;

        for (Integer eachValue : students.values()) {
            if (eachValue>maxScore){
                maxScore=eachValue;
            }
        }

        System.out.println("maxScore = " + maxScore);

        int minScore = Integer.MAX_VALUE;

        for (Integer eachValue : students.values()) {
            if (eachValue<minScore){
                minScore = eachValue;
            }
        }

        System.out.println("minScore = " + minScore);

        System.out.println("---------------------------------");

        int max = Collections.max(students.values()); // colecctions'tan gelen bu method ile daha kolay.
        int min = Collections.min(students.values());

        System.out.println("-------------------------------------------------------------------------");

        // how many students has the score of 95 ir greater

        int count = 0;

        for (Integer eachValue : students.values()) {
            if (eachValue>=95){
                count++;
            }

        }

        System.out.println("count = " + count);

        System.out.println("------------------------");

        int count2 = 0;

        for (String eachKey : students.keySet()) {
            Integer eachValueofScores = students.get(eachKey);
            if (eachValueofScores>=95){
                count2++;
            }
        }
        System.out.println("count2 = " + count2);

        System.out.println("-----------------------------------------");

        //*****************************//entrySet **********************************************************


        for (Map.Entry<String, Integer> entry : students.entrySet()) {
           // System.out.println(entry); // reutnrs entry
           // System.out.println(entry.getKey()); //returns keys
            System.out.println(entry.getValue()); // retursn values
        }

        System.out.println("----------------------------------------");






    }
}
