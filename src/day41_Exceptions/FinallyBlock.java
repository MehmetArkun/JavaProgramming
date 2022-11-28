package day41_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        int [] arr = {1,2,3};

        try{
            System.out.println(arr[10]);
            System.out.println("Try Block");
        }catch(RuntimeException e){
            System.out.println("Catch Block");
            e.printStackTrace();
        }finally {
            System.out.println("Finally Block");
        }

        //if, for instance, we put wrong exception types inside catch block and can not find the right one
        //finally block will be executed anyway
        //in order to stop execution of the final block, we gotta use System.exit(0); BEFORE finnaly method
        //like in the last line of latest catch block before finally block


    }
}
