package day45_Abstraction_Interface_Continue;

public interface PropertiesOfInterface {

    //you can not achieve encapsulation in interface as you can not use any access modifier other than public


        int a = 100; // static and final by default
        static int b = 200; // final by default

        /*

        public PropertiesOfInterface (int a) {
            this.a = a;
        }

         */

    /*
        static{
            b=100;
        }

     */

    /*


        public void method1(){
            System.out.println("Instance Method");
        }
        */


        public static void method2(){
            System.out.println("Static Method");
        }

        public abstract void method3();

        default void method () {
                System.out.println("Default method");
        }//interface can not have instance methods
        //if there is a interface functionality to be implemented in the same way by the objects, then you have default method
        //it has a body that's also another reason.
        //if super type is a class, then I can use instance method
        //default method allows us to prevent duplication
        //static varken neden default'a ihtiyac duduyurouz? cunku static one copy for the whole class
        //ama default method her bir obje icin yeni bir copy
        //so default method is treated as instance method in sublclass


}
