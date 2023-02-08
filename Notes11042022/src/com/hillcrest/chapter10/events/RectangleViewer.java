package com.hillcrest.chapter10.events;


import javax.swing.*;

public class RectangleViewer {

    public static void main(String[] args) {
        //JFrame frame = new RectangleMover();
        JFrame jFrame = new RectangleMouseMover();
        jFrame.setTitle("Rectangle Animation");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }

}
