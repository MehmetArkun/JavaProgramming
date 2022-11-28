package day53_FunctionalInterface;

public class LambdaExpressions {

    public static void main(String[] args) {

        MyThirdFunctionalInterface<String> stringReverse;

        stringReverse = (s) -> {
            String reversed = "";
            for (int i = s.length()-1; i >=0 ; i--) {
                reversed+=s.charAt(i);
            }

            return reversed;

            //String reverse = new StringBuilder(s).reverse().toString();

        };

        String result = stringReverse.method("Wooden Spoon");
        System.out.println("result = " + result);

        //create a function that can return the cuve of an integer

        MyThirdFunctionalInterface<Integer> returnCube;

        returnCube = (n) -> {
          return n*n*n;
        };


    }
}
