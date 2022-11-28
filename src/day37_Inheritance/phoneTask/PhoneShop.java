package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("Iphone 12", "6.7 inches",1000,"Black");

        Samsung samsung1 = new Samsung("galaxy S19", "6 inches", 900, "White");

        Nokia nokia1 = new Nokia("Brick", "4 inches", 50, "Gray");

        System.out.println(iphone1);
        System.out.println(samsung1);
        System.out.println(nokia1);

        iphone1.call(911);
        iphone1.faceTime(987234987);
        iphone1.faceTime("yahoo@yahoo.com");

        System.out.println("--------------------");




    }
}
