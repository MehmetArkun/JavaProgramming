package day35_Encapsulation;

public class CyberStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CyberStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static{
        schoolName = "CYDEO";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println("School name is " + schoolName);
    }

    public static void setSecretCode(){
        System.out.println("Secret code is " + secretCode);
    }

    public void attendClass(){
        System.out.println(name + " is attending the class");
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "CyberStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}



/*
2. create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode
            Add a constructor to initialize all the fields
            Add a static block to initialize all the statics
            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */
