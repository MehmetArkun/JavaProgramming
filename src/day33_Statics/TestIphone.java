package day33_Statics;


public class TestIphone {

    public static void main(String[] args) {

        // if variable is instance, it depends on object. you have to call that instance variable via obj
        // if variable is static, you dont need object. you can call that variable without obj.
        // you can call that variable or method via class name.
        // if a method needs to use a field (instance variable) or instance methods, then that method should be instance methoc
        //if a method doesnt need an instance, then it should probably be a static method.
        // static method can only accept static variables (field)
        //class can not share what object has (herkesin payi kendine)(kim kimi kopariyor kendi payinin amk)
        // object can share what class has, because they come from the class (yani static tum classa ait oldugu icin butun objectler o statici paylasiyor)
        //instance variables belong to the objects
        // static belongs to the class



        System.out.println(Iphone.OS);





    }

}
