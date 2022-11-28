package week05;

public class StringReview02 {

    public static void main(String[] args) {



        /*
        length() is usefukl to create loops that involve strings
        toUpperCase() or toLowerCase:
        replace() changing the content of the data
         */

        String message = "we still HAVE a long WAY to go, So be patient!";
        //make first character uppercase rest is lowercase

        message = message.substring(0,1).toUpperCase() + message.substring(1).toLowerCase();
        System.out.println(message);

        String browsers = "Automation with Chrome Driver";
        browsers = browsers.replace("Chrome", "Firefox").substring(0).toLowerCase();
        System.out.println(browsers);



    }
}
