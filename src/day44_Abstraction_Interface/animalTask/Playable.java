package day44_Abstraction_Interface.animalTask;

public interface Playable {

    //public abstract void play();
    //public keyword and abstract keyword here is in grey colour because they are unnecessary
    //the reason is only access modifier that you can use for interface methods can be default and public.
    //abstract keyword is also given by default. it was the only keyword implemented on methods before jdk 8.
    //after jdk 8, interface methods started to get public and static keywords as well.
    //so we can write that method without giving public and abstract keywords

    void play(); // abstract by default

    static boolean isFriendly = true; // we need to initialize it right away. we can not use static blocks in interface
    //static keyword de burada gereksiz aslinda. butun instance variable'lar static interface'de.
    //ayni zamanda final by default, tekrar re-assign edemezsin.

}
