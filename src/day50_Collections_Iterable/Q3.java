package day50_Collections_Iterable;

public class Q3 {

    public static void main(String[] args) {

        String str = "asim45muzaffer1000betul1nur82zabun";
        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);   //45+1000+1+82

                if (i == str.length() - 1 || !Character.isDigit(str.charAt(i + 1))) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }

        System.out.println(sum);



    }
}
