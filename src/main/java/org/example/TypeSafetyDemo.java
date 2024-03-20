package org.example;

import java.util.ArrayList;
import java.util.List;

public class TypeSafetyDemo {
    public static void main(String[] args) {
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of string type
        Test<String> sObj = new Test<String>("wow");


    }

}
    class  Test<T>{
        // An object T is declared
        T obj;

        Test(T obj){this .obj = obj;}

        public T getObject(){
            return this.obj;
        }
    }
