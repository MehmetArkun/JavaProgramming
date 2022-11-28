package day09_IfElseStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int n = 100;

        if (n>0){
            System.out.println("Positive");
        }


        if (n<0){
            System.out.println("Negative");
        }


        if (n==0){
            System.out.println("Zero");
        }

        System.out.println("-------------------");

        if (n>0){
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");

        }else{
            System.out.println("Zero");
        }


        //single if statements are independent
        //eger 2 if statement ve bir else kullanirsak
        //ve birinci if dogru, ikinci if yanlis ise
        //hem birinci statemement hem de else statement print olur
        //else statemenetin printed olmasi ikinci bagimsiz if in false olmasiyla alakali
        //else in ustundeki false oldugu icin else otomatik printed
        //bu yuzden single if leri sadece 1 outcome da kullanmak lazim
        //if ve else i 2 li outcomelerda
        //if, else if ve else i ise 2 den fazla outcomelarda



    }
}
