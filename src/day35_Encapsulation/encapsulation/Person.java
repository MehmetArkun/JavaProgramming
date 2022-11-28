package day35_Encapsulation.encapsulation;

public class Person {

    private String name;
    private int age;
    //those variables can not be directly accessed from outside class

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {//setter method can be void as I do not need to return anything
        //I just need it to set the value
        this.name = name;
    }

    public void setAge(int age) {

        if (age<=0 || age > 150){
            System.err.println("Invalid Age " + age);
            System.exit(0);
            // if it is private you have more control over it
            //if it is public you do not have control over it
        }
        this.age = age;
    }


}
