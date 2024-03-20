package org.example;

import java.util.ArrayList;

public class WildCardExample2 {
    //  pperBound wILDcARD

    private  static Double add(ArrayList<? extends  Number> numbers){
        double sum = 0.0;

        for (Number n : numbers){
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();

        integers.add(10);
        integers.add(20);

        System.out.println( add(integers));

        ArrayList<Double> doubles = new ArrayList<Double>();

        doubles.add(30.0);
        doubles.add(40.0);

        System.out.println(add(doubles));
    }
}
