package day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls (){
        System.out.println("Default Constructor");
    }

    public ConstructorCalls (int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls (String str){
        this(8);
        System.out.println("Constructor with String Argument");
    }

    public static void main(String[] args) {
        ConstructorCalls obj1 = new ConstructorCalls();
        ConstructorCalls obj2 = new ConstructorCalls(8);

        System.out.println("---------------------------");

        ConstructorCalls obj3 = new ConstructorCalls("Java");


    }



}
