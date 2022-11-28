package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

    }

    static{
        //it is a set of instructions that is run only once when a class is loaded into memory
        //it is also called static initialization block
        //if you have a static block in the java program
        //static block is the first one to be executed
        //then, main method can be executed
        //it runs only one time
        //you can not call it. it is executed once the class is loaded
        //if you have a static variable for which it takes more than one step to set(initialize),
        //then you gotta use static block to initialize (set) it.
    }
}
