package day28_ArrayList;

public class StrongPassword2 {

    public static void main(String[] args) {

        String password = "cLdeo1990@";


        int countUppercase = 0;
        int countLowercase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);
            if (Character.isUpperCase(each)){
                countUppercase++;
            } else if (Character.isLowerCase(each)) {
                countLowercase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            }else {
                countSpecialChar++;
            }
        }

        boolean hasDigits = countDigits > 0;
        boolean hasUpperCase = countUppercase > 0;
        boolean hasLowerCase = countLowercase > 0;
        boolean hasSpecialChar = countSpecialChar > 0;

        boolean strongPassword = password.length() >= 8 && !password.contains(" ") && hasDigits && hasUpperCase && hasLowerCase && hasSpecialChar;


    }
}
