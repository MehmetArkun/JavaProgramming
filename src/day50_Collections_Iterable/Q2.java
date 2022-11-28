package day50_Collections_Iterable;

import java.util.Arrays;

public class Q2 {

   /*
    asim45muzaffer1000betul1nur82zabun
    */

    public static void main(String[] args) {

        String str = "asim45muzaffer1000betul1nur82zabun";

        char [] arr = str.toCharArray();
        String sum = "";

        for (char c : arr) {
            boolean isCh = Character.isDigit(c);
            boolean isLet = Character.isLetter(c);
            if (isCh){
                sum+=c;
            }else {
                sum+="a";
            }
        }

        System.out.println("sum = " + sum);
        String [] n1 = sum.split("a");




        System.out.println(Arrays.toString(n1));



    }

}
