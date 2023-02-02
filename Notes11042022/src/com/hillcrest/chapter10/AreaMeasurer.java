package com.hillcrest.chapter10;

import java.awt.*;

public class AreaMeasurer implements Measurer{


    @Override
    public double measure(Object object) {
        var rect = (Rectangle) object;
        double area = rect.getWidth() * rect.getHeight();
        return area;

    }
}
