package org.example.solid;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {
    public int sum(List<Shape> shapes) {

        int sum = 0;

        for (Shape shape : shapes) {
            sum += shape.area();
        }

        return sum;

    }

}
