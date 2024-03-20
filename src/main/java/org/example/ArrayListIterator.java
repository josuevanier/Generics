package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {

        Integer[] intArray = {10,20,3,4,5};

        TestGenerics4.printArray(intArray);

        Character[] charArray = {'J','K','L'};

        TestGenerics4.printArray(charArray);
    }
}

class TestGenerics4 {
    static <E> void printArray(E[] elements){
        for(E element :  elements){
            System.out.println(element);
        }
    }
}
