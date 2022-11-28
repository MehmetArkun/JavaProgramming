package day50_Collections_Iterable;

public class Q {

    public static void main(String[] args) {
        /*
        https://find-and-update.company-information.service.gov.uk/company/11984521
         */
    }

    public static void isValid(String password) {
        boolean isValid = true;

        char[] arr = password.toCharArray();
        boolean atLeast = false;
        boolean atLeast1 = false;
        boolean atleast2 = false;
        boolean atleast3 = false;

        for (char s : arr) {

            if (s >= 'a' && s <= 'z') {
                atLeast = true;
            }

            if (s >= 'A' && s <= 'Z') {
                atLeast1 = true;
            }

            if (s >= 0 && s <= 9) {
                atleast2 = true;

            }

            if ((s >= 33 && s <= 47) || (s >= 58 &&
                    s <= 64) || (s >= 91 && s <= 96)){
                atleast3 = true;
            }

        }


        if (password.length() >= 8 && atLeast && atLeast1 && atleast2 && atleast3) {
            isValid = true;
        }

        System.out.println("isValid = " + isValid);


    }


}
