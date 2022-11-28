package day20_Arrays;

public class AppearedTwice {

    public static void main(String[] args) {

        char [] characters = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};



        for (int j = 0; j < characters.length; j++) {

            char ch = characters[j];
            int frequency = 0;

            for (int i = 0; i < characters.length; i++) {
                if (characters[i] == ch) {
                    frequency++;
                }
            }

            if (frequency==2){
                System.out.println(ch);
            }

        }


    }
}
