package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Korkmaz", 29, 'M', "1",45000);

        Tester tester = new Tester("Olga", 27, 'F', "2", 110000);
        Teacher teacher = new Teacher("Daniel", 32, 'M', "3", 100000);
        Student student = new Student ("Suhaib", 30, 'M', "8", "SDET");


        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("--------------");
        developer.work();
        teacher.work();
        tester.work();
        student.drink();
        teacher.eat();




    }
}
