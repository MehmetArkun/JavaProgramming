package Day52_Map_Functional_Interface;


@FunctionalInterface
public interface MyFirstFunctionalInterface {

    void apply(int n);



}

/*
created for the purpose of function
single abstract method interface
it can only have one abstract method
@FunctionalInterface annotation is applicaple (Optional)

SInce funcitonal interface can not be inherited,
we are gonna use lambda expression to give implementation to the method

it is meant to be a function
it is not meant to be inherited
 */
