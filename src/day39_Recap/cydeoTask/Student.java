package day39_Recap.cydeoTask;

public class Student extends Person {

    private String studentId;
    private String fieldOfStudy;

    public Student(String name, int age, char gender, String studentId, String fieldOfStudy) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
    }

    public void study() {
        System.out.println(getName() + " is studying");
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }


    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}

/*
6. Create a sub class of Person named Student
            Extra variables:
                studentId, fieldOfStudy
            Encapsulate all the fields
            Add a constructor to set all the fields
            Encapsulate all the fields
            Methods:
                study()
 */
