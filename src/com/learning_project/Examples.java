package com.learning_project;

import java.util.List;

public class Examples {
    public static boolean isStringInListStatic(List<String> stringsList, String stringToFind) {
        for (String string : stringsList) {
            if(string.equalsIgnoreCase(stringToFind)) {
                return true;
            }
        }
        return false;
    }

    public boolean isStringInListNonStatic(List<String> stringsList, String stringToFind) {
        return stringsList.contains(stringToFind);
    }



}
