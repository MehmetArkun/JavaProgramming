package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        // add method

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // buradaki 10 aslinda integer, ama otomatikman Integer wrapper class'a donusturuyor yani autoboxing yapiyor
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(2,25); // 2. elemente 25 gelecek, eski 2. element 3. elemente shift olacak.
        //dolayisiyla size artmis olacak
        // the add method itself basically adds the date at the given index.

        System.out.println("=-----------");

        // size method
        //gives the size of the aray lost
        System.out.println(numbers.size());

        System.out.println("-------------");

        int lastIndex = numbers.size()-1;

        System.out.println("------");

        // get method
        //you need to provide an argument inside the method
        //get(index) returns the element at the index

        int num = numbers.get(3);// bu simdi su an Integer wrapper ama int primitive e assgin edebilirim yani unbox
        System.out.println("num= " + num);

        System.out.println("--------------");

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-------");

        // set(index, new element) replaces the element at the given index with the given new element

        ArrayList <String> list = new ArrayList <> ();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2,"JavaScript");
        list.set(3, "C++");
        System.out.println(list);

        System.out.println("--------------");

        // remove decreases the size one by one
        //if you pass int, it perceives it as an index number and removes the element at the index
        // if you give anything than integer, then it removes that element if it is a string
        //remove("StringName")

        ArrayList <String> employees = new ArrayList <>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);
        //there is another remove method which is without index number entry
        // that one removes the object completely

        employees.remove(employees.size()-1);
        System.out.println(employees);

        employees.remove("Ali");
        System.out.println(employees);

        // eger object remove etmeyi kullanirsak, ve remove ederse, true boolean sonucu verir
        //dolayisiyla onu boolean variable a assign edebilriz
        boolean r1 = employees.remove("Olga");

    }
}
