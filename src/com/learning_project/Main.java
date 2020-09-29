package com.learning_project;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> ListOfStrings = new ArrayList<>();
        ListOfStrings.add("String1");
        ListOfStrings.add("String2");
        ListOfStrings.add("String3");
        ListOfStrings.add("String4");


        boolean found = Examples.isStringInListStatic(ListOfStrings, "String2");
        if (found) {
            System.out.println("Am gasit!");
        } else {
            System.out.println("N-am gasit. :(");
        }



        Examples ex = new Examples();
        found = ex.isStringInListNonStatic(ListOfStrings, "asd");
        if (found) {
            System.out.println("Am gasit!");
        } else {
            System.out.println("N-am gasit. :(");
        }

        Environment environmentClassObject = new Environment();
        environmentClassObject.composeEnvUrl("test");

    }
}
