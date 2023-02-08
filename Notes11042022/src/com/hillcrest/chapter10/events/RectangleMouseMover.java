package com.hillcrest.chapter10.events;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RectangleMouseMover extends JFrame {

    private RectangleComponent component;

    class MousePressListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e){
            int x = e.getX();
            int y = e.getY();
            component.moveBox(x, y);

        }

        @Override
        public void mousePressed(MouseEvent e){

        }

        @Override
        public void mouseReleased(MouseEvent e){

        }

        @Override
        public void mouseEntered(MouseEvent e){

        }

        @Override
        public void mouseExited(MouseEvent e){

        }

        public RectangleMouseMover(){
            component = new RectangleComponent();
            super.add(component);

            MousePressListener listener = new MousePressListener();
            component.addMouseListener(listener);
            setSize(500, 500);

        }

    }

}
