package day27_WrapperClasses;

public class WrapperClassesMethods {

    public static void main(String[] args) {

        //parse method = converts String to primitive
        //valueOf method = converts String to wrapper class

        //isDigit() = checks if a character is digit or not (checks form asci table)
        //isLetter() = checks if a character is letter or not
        //isLetterOrDigit = checks if it is a letter or digit. we can determine if a ch is special or not
        //isUpperCase = checks if ch is uppercase
        //isLowerCase = checks if ch is lowercase

        String str = "123";

        int num = Integer.parseInt(str);//we call the method from Integer wrapper class
        System.out.println(num + 1);//124
        System.out.println(str + 1);//1231

        System.out.println("------------");

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2);
        System.out.println("--------");
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println("minLong = " + minLong);
        System.out.println("maxLong = " + maxLong);
        System.out.println("--------------------");
        String s1 = "true";//as long as it is not true, it will be false
        boolean r1 = Boolean.parseBoolean(s1);

        //valueOf method
        //convets String to wrapper class
        //asagidaki ornekte Stringi Integer wrapper'a donusturuyoruz
        //wrapper'a donusturdukten sonra Integer wrapper variable'a assign ediyoruz
        //sonrasinda da o wrapper'i integer primitive data type'a unboxing edebiliriz
        String s2 = "123";
        Integer x = Integer.valueOf(s2); //
        int y = x; // unboxing // veya soyle de yapabilriiz int y = Integer.valueOf(s2);

        System.out.println(x);
        System.out.println(y);


        System.out.println("------");

        //isDigit()
        char ch1 = 'A';
       boolean r2 = Character.isDigit(ch1);

       //isLetter ()
        char ch2 = '0';
        boolean r3 = Character.isLetter(ch2);

        boolean r4 = !Character.isLetterOrDigit(ch1);

        System.out.println(r4);// false yani special degil

        System.out.println("------");

        String s = "ab1cde2effg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()){
            if (Character.isDigit(each)){
                sum += Integer.parseInt(""+each);//iceriye char koyduk, string koymamiz lazim cunku bu method stringi primitive'e donusturuyor
            }
        }

        System.out.println(sum);

    }
}
