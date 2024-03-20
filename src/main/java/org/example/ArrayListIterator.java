package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("rahul");
        list.add("jail");
        list.add(32); // Compile for you
        String s = list.get(1); // type casting is required
        System.out.println("Element is " + s);

        Iterator<String> itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
