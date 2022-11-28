package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

        int s = 95;
        String result = "";// temporary string variable to be used for print statement

        if (s>=0 && s<=100){
            if (s>=90 && s<=100){//s<=100 kismi fazlalik artik, yazmayabiliriz
                result = "Excellent"; // if 'if statement' is true, then string variable of result becomes excellent
            } else if (s>=80 && s <=89) {//s<=89 kismi fazlalik yazmayabilriiz
                result = "Great"; // if 'else-if' variable is true, then result variable becomes great

            } else if (s>=70 && s<=79) {//aynen yukaridaki gibi ikinci kisim fazlalik
                result = "Good"; // if 'else-if' variable is true, then result variable becomes good
            } else if (s>=60 && s<=69) {//yukarinin aynisi
                result = "Passed"; //if 'else-if' variable is true, then result variable becomes passed
            } else {
                result = "Failed"; // if every if condition above is false, then else is printed as result being failed
            }
        }else {
            result = "Invalid s";
        }

        System.out.println("Result: " + result);


    }
}

/*
90~100 excellent
80~89 great
70~79 good
60~69 passed
0~59 failed
 */

