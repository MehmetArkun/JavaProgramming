package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        // isEmpty - checks if there is zero character in string // boolean
        // isBlank - checks if the string is void // boolean
        //isBlank'e gore space blanktir
        //equalsIgnoreCase() will ignore cases regardles whether they are upper or lower // boolean
        //contains() will check if given character is present inside string // boolean
        // startsWith | endsWith

        String str = " "; // this is blank, but no empty, because there is space between two quotes
        boolean empty = str.isEmpty();
        boolean blank = str.isBlank();

        System.out.println(empty); // false
        System.out.println(blank);// true

        System.out.println("-----------");

        String str2 = "Cydeo     ";
        System.out.println(str2.isBlank());// false

        System.out.println("---------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        //yes, YES, yEs, yES

        System.out.println("YES".equalsIgnoreCase("yEs"));//true

        System.out.println("----------------------------");

        String sentence = "My favourite programming language is Java";

        boolean hasCSharp = sentence.contains("C#"); // gonna return boolean // false
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java"); //
        boolean hasJava3 = sentence.toLowerCase().contains("java");//burada ilk basta lower case yaptik sonra contain check ettik

        System.out.println(hasCSharp);
        System.out.println("hasJava3 = " + hasJava3);
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("hasJava = " + hasJava);

        System.out.println("---------------------");
        String input1 = "I love jAvA";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); // false
        System.out.println(input1.equals("Java")); // true
        System.out.println(input1.toLowerCase().contains("java")); // true
        System.out.println(input1.toUpperCase().contains("JAVA")); // true

        System.out.println("-----------------------");

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo"); // true
        boolean y = a.endsWith("Spoon"); // true
        boolean z = a.toLowerCase().startsWith("wooden"); // true

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);







    }
}
