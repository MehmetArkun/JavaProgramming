package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100;
    static int defaultData = 200; // access modifier: default
    private static int privateData = 300; // access modifier: private
    protected static int protectedData = 400; // access modifier: protected

    public static void method1(){
        System.out.println("Public");
    }

    static void method(){
        System.out.println("Default");
    }

    private static void method3(){
        System.out.println("Private");
    }

    public static void main(String[] args) {

        System.out.println(publicData); // visible to all
        System.out.println(protectedData); // not visible to world(other packages)
        System.out.println(defaultData);// not visible to subclasses and world
        System.out.println(privateData);//not visible to package, subclasses, and world

        // public class name should match the file name
        // there can only one public class inside a java file




    }

}
