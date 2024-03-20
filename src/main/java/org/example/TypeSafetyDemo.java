package org.example;

import java.util.ArrayList;
import java.util.List;

public class TypeSafetyDemo {
    public static void main(String[] args) {

        List list = new ArrayList();

        String s = (String) list.get(0); // typecasting

        // After Generics, we don't need to typecast the object

        List<String> lists = new ArrayList<String>();
        list.add("hello");

        String d = lists.get(0);
    }
}
