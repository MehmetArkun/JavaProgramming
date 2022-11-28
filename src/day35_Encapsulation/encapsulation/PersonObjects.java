package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Ilkkan");
        person1.setAge(39);
        int ilkkanAge = person1.getAge();
        System.out.println(ilkkanAge);

    }
}
