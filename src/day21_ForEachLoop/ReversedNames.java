package day21_ForEachLoop;

public class ReversedNames {

    public static void main(String[] args) {

        String [] names = {"Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov",
                "Ruveyda Durna", "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};


        for (String each : names) { //each represents every single name

            String reversed ="";

            for (int i = each.length()-1; i >= 0 ; i--) {
                reversed += each.charAt(i);

            }

            System.out.println(reversed);

        }


    }
}
