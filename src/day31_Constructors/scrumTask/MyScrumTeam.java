package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Layan", "QA", 11,110000);
        Tester tester2 = new Tester("Ali", "SDET", 43, 142000);
        Tester tester3 = new Tester ("Alex", "SE", 44,135000);
        Tester tester4 = new Tester ("Lala", "SDET", 23, 115000);

        Tester [] testers = {tester2,tester3,tester4};

        Developer developer1 = new Developer ("Olga", 22, "Java Developer", 125000);
        Developer developer2 = new Developer ("Aygun", 39, "Java Master", 185000);
        Developer developer3 = new Developer ("Tunc", 28, "Software Developer", 135000);
        Developer developer4 = new Developer ("Sinem", 13, "Senior Developer", 200000);

        Developer[] developers = {developer2,developer3,developer4};

        ScrumTeam scrum = new ScrumTeam ("Nigara", "Huseyin", "Neira", 14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("------------------------------------------");

        for (Tester eachTester : scrum.testersList) {
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }

        for (Developer eachDeveloper : scrum.developersList) {
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }

        scrum.removeTester(23);
        System.out.println(scrum);

        scrum.removeDeveloper(22);
        System.out.println(scrum);



    }
}
