package day50_Collections_Iterable;

import java.util.*;

public class IterablePractice2ReviewQuestion {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"));
        //remove ahmed

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            if (it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }
        System.out.println("names = " + names);

        /*
        names.removeIf(each -> each.equalsIgnoreCase("ahmed"));
                System.out.println("names = " + names);

         */

        System.out.println("--------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"));
        //remove ahmed

        for (Iterator<String> i = names2.iterator(); it.hasNext(); ){
            if (i.next().equalsIgnoreCase("ahmed")){
                i.remove();
            }
        }

        System.out.println("----------------------");







}
}
