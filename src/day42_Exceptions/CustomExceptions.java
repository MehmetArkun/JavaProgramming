package day42_Exceptions;

class FadyException extends RuntimeException{

    public FadyException (String message){
        //System.out.println("It is time for break");
        //this is default constructor. everytime we create the object, it prints our statement
        //below we are creating exception object. whenever we create that custom exception, print statement is printed
        //bunun yerine parent class'in constructor'ini cagirabilirz superkeyword ile.
        //o constructor string argumenti aliyor.
        super(message);
        //exceptioni asagida create ettigimizde mesaji hyazmak zorundayiz so parent class constrictor can be callsed
    }
// simdi bir tane daha constructor olusturacagim

    public FadyException (){
        super("time for a short break");
        //bu constructor parameter icermiyor direk bu yazdiigim statememnti iceriyor
        //o yuzden ne zaman exception create etsem bunu gostercek konsolda
    }


} // custom unchecked exception class

class NoBreakException extends Exception {


} // custom checked exception class

public class CustomExceptions {

    public static void main(String[] args) {

        throw new FadyException("It is time for break");
        //


    }




}
