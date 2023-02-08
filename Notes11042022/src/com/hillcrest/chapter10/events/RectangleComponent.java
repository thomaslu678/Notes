package com.hillcrest.chapter10.events;

import java.awt.*;

public class RectangleComponent {

    private static final int X = 50;
    private static final int Y = 50;
    private static final int WIDTH = 50;
    private static final int HEIGHT = 50;


    private Rectangle box;

    public RectangleComponent(){
        box = new Rectangle(X, Y, WIDTH, HEIGHT);

    }

    public void moveBox(int x, int y){
        box.setLocation(x, y);
        repaint();
    }


}
