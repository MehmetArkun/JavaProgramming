package day50_Collections_Iterable;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterable {


    // before lambda expression, we were using iterable to remove an item from collections
    //we can obtain iteraotr by using iterator() method of an iterable.
    //iterator provides the ready methods that can be used while traversing the colelctions
    //-hasNext() , next() , remove()
    //any collection type has this iterator() method. once you call this method, you have acess to iteraor inner interface

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        // we are trying to remove all the elements that are less than 4

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) < 4) {
                list.remove(i);
                //indexes will be shifting. some of the elements will be skipped.
                //so using remove method is not convenient
                //so thats the reason why iterable introduced, which does not care about the ondex numbers
                //so before lambda expression existed, we used to use iterable.
            }

        }
        System.out.println(list);

        System.out.println("----------------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        //remove all the elements that are less than 4

        Iterator<Integer> it = list2.iterator();
        boolean r1 = it.hasNext();
/*


        System.out.println(r1);

        System.out.println(it.next());

        boolean r2 = it.hasNext();

        System.out.println(r2);

        System.out.println(it.next());
        */

        while(it.hasNext()){
            if(it.next() <4){
                it.remove();
            }
        }

        System.out.println(list2);

        System.out.println("----------------------------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        for(Iterator<Integer> i = list3.iterator() ; i.hasNext() ; ){
            if(it.next() <4){
                it.remove();
            }
        }

        System.out.println("list3 = " + list3);

        System.out.println("---------------------------------------------------");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        list.removeIf(each -> each<4);

        System.out.println("list4 = " + list4);




    }
}
