package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJavaJava";

        int frequency = 0;

        for (int i = 0; i <= str.length()-4; i++) {

            String eachSub = str.substring(i,i+4);
            if (eachSub.equalsIgnoreCase("Java")){
                ++frequency;
            }


        }

        System.out.println(frequency);
    }
}

/*
write a program that can return the frequency of the word Jaba from the sentence

output: 3

 */