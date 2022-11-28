package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        //compiler in the background does this: short b = (short)a
        //this is called implicit casting. the compiler does the job in the background.
        //this is the reason why we don't see the process inside paranthesis.
        //this happens when we try to assign a smaller primitive type to larger primitive type
        //double > float > long > int > short > byte

        int c = b; //implicit casting
        //in the background it is like this: int c = (int)b;

        long d = c;
        //in the background, it is like this: long d = (long)c

        float e = d;
        double f = e;

        //if you try to do the opposite, if you try to assign a larget type to a small one, then you have to use explicit casting
        //in that case, you have to do casting manually by yourself.

        int x = 100;
        byte y = (byte)x;
        //in this instance, I put (byte) manually by myself while casting
        //because int is larger than byte, and I tried to assign int to byte.

        System.out.println(x + " = " + y);

        double n = 10.8;
        int s = (int)n; //this will give only 10. it will not give decimal part.

        System.out.println(n + " : " + s);

        System.out.println("-------------------------------------------------");

        double d1 = 20.5;
        short s1 = (short) d1;
        // to use shortcut: after semi-colon, hold option button and press enter button.
        // then choose casting ---> manual explicit casting
        // you can also use click option on red bulb that pops up after you did something wrong such as trying to cast larger type to smaller type

        System.out.println(d1 + " : " + s1);












    }
}
