package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String [] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String eachWord : words) {
            System.out.print(eachWord.charAt(0) +""+ eachWord.charAt(eachWord.length()-1));
        }




    }
}
