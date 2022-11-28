package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {

        Employee employee = null;

        //System.out.println(employee.getSalary());

        // it is possible that we can get an exception since we put null in ibject
        // daha ince karsilastigimiz 3 exceptiondan biri veya daha fazlasi karsimizac cikabilir
        //birden fazla senarto var simdi o senaryolari construct edecegiz
        try{
            System.out.println(employee.getSalary());
        }catch (IndexOutOfBoundsException e){
            System.out.println("first catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }


        //in the result, nullpointerexception was finally caught
        //all those catch blocks are gonna be tried until one of them finds the fish :)
        //garantiye almak icin en sonuncusuna runtimeexception verebilriiz
        //mutlicatch block is totally optional

        System.out.println("Test Completed");








    }
}
