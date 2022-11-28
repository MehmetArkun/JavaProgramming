package day26_CustomMethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {

    }

    //returns frequency of int element from the given int array
    public static int frequencyOfElement (int [] array, int element){

        int frequency = 0;

        for (int each : array) {
            if (each == element){
                frequency++;
            }
        }

        return frequency;


    }

    //returns frequency of double element from the given double array
    public static int frequencyOfElement (double [] array, double element){

        int frequency = 0;

        for (double each : array) {
            if (each == element){
                frequency++;
            }
        }

        return frequency;


    }

    //returns frequency of String element from the given String array
    public static int frequencyOfElement (String [] array, String element){

        int frequency = 0;

        for (String each : array) {
            if (each.equals(element)){
                frequency++;
            }
        }

        return frequency;


    }

    //returns frequency of char element from the given char array
    public static int frequencyOfElement (char [] array, char element){


        int frequency = 0;

        for (char each : array) {
            if (each == element){
                frequency++;
            }
        }

        return frequency;


    }

}
