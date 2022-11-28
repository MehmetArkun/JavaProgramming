package day19_LoopsPractises;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;


            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each){
                    count++;

                }

            }
/*
            if (count == 1){//if the frequency of character is 1, then character is unique
                result+=ch;
            }


 */
            if (count !=1){
                continue;
            }

            result+=ch;

        }

        System.out.println(result);



    }
}

/*
write a program that can find the unique characters from a string without using index()
and lastIndexOf() methods
ex:

str = "aabccdeef"
output: bdf


 */