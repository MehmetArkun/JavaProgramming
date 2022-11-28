package day40_FinalKeyword;

public class FinalKeywordIntro {

    final String birthday;

    public FinalKeywordIntro(String birthday) {
        this.birthday = birthday;
    }

    //ilk instance variable i olusturdugumuzda error verdi
    //constructor olusturduk erroru bertaraf etmek icin

    final static String name;

    static{
        name = "Batch 25";
    }

    //ilk static final variablei olsuturdugumuzda error verdi
    //static blocku olsuturduk ki error vermesin




    public static void main(String[] args) {
        //used to restrict user
        //makes the features unchangeable
        //final keyword is applicable to a variable, method and a class

        //variarbles become constant
        //value of the variable cann not be modified
        //we can not reassing a final variable
        //once you set it, you can not change
        //when creating the object, you can assign it for one time
        //then you can not change it


    }
}
