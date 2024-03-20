package org.example;

import java.util.ArrayList;
import java.util.List;

public class TypeSafetyDemo {
    public static void main(String[] args) {
        // What this doing it takes two paraemeter you mst past the value of the string and the integer
        Test<String, Integer> obj = new Test<String, Integer>("MTL",15);

        obj.print();

    }

}
    class  Test<T, U>{
        // An object T is declared
        T obj;
        U obj2;


        Test(T obj, U obj2){this .obj = obj;
        this.obj2 = obj2;}

        public void print(){
            System.out.println(obj);
            System.out.println(obj2);
        }
}
