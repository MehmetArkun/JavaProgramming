package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School! @#$%WoodenSpoon";

        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i <= str.length()-1; i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch<= 'z' || ch >= 'A' && ch <= 'Z'){
                letters += ch;
            } else if (ch >= '0' && ch <= '9') {//if the character is between '0' to '9'
                digits +=ch;

            }else {
                if (ch!= ' ')
                specialChars += ch;
            }
        }

        System.out.println("specialChars = " + specialChars);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);




    }
}
