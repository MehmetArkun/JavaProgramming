package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Tes2 {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);

        //default can not be called here because it is in another package

        AccessModifiers.method1();

    }


}
