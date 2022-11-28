package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static{
        System.out.println("Static Block");
    }

    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        System.out.println("Main Method");
    }

    //static method gets executed first, the main method will be executed
    //constructor will be executed only if we crete object

    // static block


}
