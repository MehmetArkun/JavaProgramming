package day31_Constructors;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 'M', 32);
        // since we created constructed by ourselves with paramtireized type, we do not have to
        //invoke setinfo method

        Person person2 = new Person ("Ksenia",'F',28);

        System.out.println(person2);
        System.out.println(person1);

    }
}
