package org.example;

import java.util.ArrayList;
import java.util.List;

public class TypeSafetyDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);

        list.add("20"); // list can take  anything type

        // but the type in diamonds its comfirmed

        List<Integer> lists = new ArrayList<Integer>();
        lists.add(1);

        lists.add("1"); // compile time error
    }
}
