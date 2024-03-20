package org.example;

import java.util.Arrays;
import java.util.List;

public class LowerBoundExample {
    public static void addNumbers(List<? super Integer> list){
        for(Object n : list){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3);

        addNumbers(integers);

        List<Number> numbers = Arrays.asList(1.0,2.0,3.0);
        addNumbers(numbers);
    }
}
