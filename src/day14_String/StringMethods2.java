package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        //replace() --> (oldvalue,newvalue)
        //replaceFirst() ilk value yu replace eder digerlerini birakir

        String str = "Java is fun, I love learning Java";
        str = str.replace("Java" , "Python");

        System.out.println("str = " + str);

        String email = "JohnSmith@yahoo.com";
        email= email.replace("yahoo" , "gmail");

        System.out.println(email);

        String sentence = "Java Java Python C# C# C++ C++ Python Python Python";
        String sentence2 = sentence.replace( "Python" , "").replace("   " , " ");
        System.out.println(sentence2);

        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog" , "Cat");
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace(" C#" , " Java"); // bosluklu C# ikincisi, biz de
        //zaten onu degistirmeye calisiyoruz, yerine bosluklu Java koyduk
        System.out.println("s2 = " + s2);

        System.out.println("---------------------------------");

        String result = " Java Java Java";
        result = result.replaceFirst("Java" , "Python");
        System.out.println("result = " + result);
        //burada ilk Java gitti, yerine Python geldi, diger Javalar duruyor

        System.out.println("------------------------------");

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#" , "Java");
        System.out.println(result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("a" , "o");






    }
}
