package org.example;

import java.util.ArrayList;
import java.util.List;

public class WildCardExample {
    public static void main(String[] args) {
        List<Rectangle> list1 = new ArrayList<Rectangle>();

        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<Circle>();

        list2.add(new Circle());
        list2.add(new Circle());

        GenericTest.drawShapes(list1);

        GenericTest.drawShapes(list2);
    }
}
abstract  class Shape{
    abstract  void draw();
}

class  Rectangle extends  Shape{
    void draw(){
        System.out.println("Drawing  rectangle");
    }
}
class Circle extends  Shape{
    @Override
    void draw() {
        System.out.println("Drawing a circle ");
    }
}
class GenericTest{
    public static void drawShapes(List<? extends Shape> lists){
        for(Shape s : lists){
            s.draw();
        }
    }
}


