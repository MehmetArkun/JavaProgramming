package day07_Operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        //assigment: = used to assign values/data to datatypes
        int number = 100;

        System.out.println(number);//100

        number = 200; //now, after line 10, starting from line 13, number will give 200

        System.out.println(number);//200

        String word = "Java Programming";

        System.out.println("word = " + word);//Java Programming

        word = "Wooden Spon";

        System.out.println("word = " + word);// Wooden Spoon

        //So, basically, assigment operator used to assign new value to the same variable
        // variables remembers the last initialization

        word = "Cydeo";

        System.out.println("word = " + word);
        //basically this operator updates the values of the variable

        //Addition Assigment: 
        
        int x = 100;

        System.out.println("x = " + x);

        System.out.println(x + 200); // this is 300 and this doesnt change the value of x
        
        x = x + 200; // from now on x will be 300
        
        //there is also a short cut for that +=
        
        x+=200;

        System.out.println("x = " + x);

        System.out.println("---------------");
        
        
        //it also works with strings as well
        
        String str = "Wooden";
        
        str+= "Spoon";

        System.out.println("str = " + str);

        System.out.println("-------------");

        double availableBalance = 1000.50;

        availableBalance += 300;

        availableBalance -= 200;

        System.out.println("availableBalance = " + availableBalance);
        
        //subtraction assigment operator doesnt work with string
        //addition assigment operator is the only operator that works with string
        
        double salary = 5000.50;

        System.out.println(salary);
        
        salary *= 2;

        System.out.println("salary = " + salary);

        //same applies for divison operator as well
        
        //now remainder assigment
        
        double num3 = 100;
        
        num3 %= 3; // in the background, 100 is divided by 3 and remainder, manely the 1 becomes the new variable

        System.out.println("num3 = " + num3);


        int y = 300;

        y %= 16;


        System.out.println("-----------------");















    }
}
