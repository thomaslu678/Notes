package com.hillcrest.chapter10.events;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ButtonViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");
        frame.add(button);

        ActionListener clickListener = new ClickListener();
        button.addActionListener(clickListener);

        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
