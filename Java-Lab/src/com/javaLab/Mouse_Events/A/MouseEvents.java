package com.javaLab.Mouse_Events.A;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.Time;

public class MouseEvents extends JFrame implements MouseListener, MouseMotionListener {
    int x,y,ch;
    Timer time;
    public MouseEvents(){
        setSize(400,400);
        setVisible(true);
        setTitle("MOUSE AND MOUSE MOTION EVENTS");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        ch=1;
        x=e.getX();
        y=e.getY();
        repaint();
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        ch=2;
        x=e.getX();
        y=e.getY();
        repaint();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        ch=3;
        x=e.getX();
        y=e.getY();
        repaint();
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        ch=4;
        x=e.getX();
        y=e.getY();
        repaint();
    }
    @Override
    public void mouseExited(MouseEvent e) {
        ch=5;
        x=e.getX();
        y=e.getY();
        repaint();
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        ch=6;
        x=e.getX();
        y=e.getY();
        repaint();
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        ch=7;
        x=e.getX();
        y=e.getY();
        repaint();
    }
    public void paint(Graphics g){
        switch (ch){
            case 1:g.drawString("Mouse Pressed",x,y);
                break;
            case 2: g.drawString("Mouse Released",x,y);
                break;
            case 3: g.drawString("Mouse Clicked",x,y);
                break;
            case 4: g.drawString("Mouse Entered",x,y);
                break;
            case 5: g.drawString("Mouse Exited",x,y);
                break;
            case 6: g.drawString("Mouse Dragged",x,y);
                break;
            case 7: g.drawString("Mouse Moved",x,y);
                break;
        }
    }
    public static void main(String args[]){
        new MouseEvents();
    }
}
