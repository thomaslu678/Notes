package com.hillcrest.chapter10.events;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleMover extends JFrame {

    private RectangleComponent component;

    class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }

        public RectangleMover(){
            component = new RectangleComponent();
            add(component);
            setSize(800, 500);

            ActionListener listener = new TimerListener();
            final int DELAY = 100;
            timer t = new Timer(DELAY, listener);
            t.start();
        }

    }

}
