package com.cydeo.solid.liskovSubstitution.good;

import java.util.Arrays;
import java.util.List;

public class MyApp {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(3);
        rectangle.setWidth(5);

        Square square = new Square();
        square.setSide(4);

        //List<Rectangle> rectangles = Arrays.asList(rectangle, square);

        //changeHeightAndWidth(rectangle);

    }

    public static void changeHeightAndWidth(List<Rectangle> rectangles) {

        for (Rectangle rectangle : rectangles) {
            rectangle.setHeight(5);
            System.out.println(rectangle.getArea() == 30);
        }

    }

}
