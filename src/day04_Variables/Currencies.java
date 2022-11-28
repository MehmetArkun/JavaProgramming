package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1000;

        double lira = dollar * 15.08;
        double euro = dollar * 0.95;
        double JPY = dollar * 130.41;
        double pound = dollar * 0.81;
        double CAD = dollar * 1.30;

        System.out.println("dollar = " + dollar);
        System.out.println("CAD = " + CAD);
        System.out.println("pound = " + pound);
        System.out.println("euro = " + euro);
        System.out.println("lira = " + lira);
        System.out.println("JPY = " + JPY);


    }

}
