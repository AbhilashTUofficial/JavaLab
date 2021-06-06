package com.javaLab.Different_Shapes.S;
import javax.swing.*;
import java.awt.*;

public class Shapes {
    public static void main(String args[]){
        JFrame obj=new JFrame();
        Draw brush=new Draw();
        int x=20;
        int y=10;
        int width=650,height=650;
        obj.setBounds(x,y,width,height);
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setTitle("Different shapes");
        obj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        obj.add(brush);
    }
}
class Draw extends JPanel{
    public void paint(Graphics g){
        g.drawString("DIFFERENT SHAPES",250,45);
        g.drawLine(250,48,360,48);
        g.drawString("SQUARE",60,60);
        g.drawRect(30,65,125,125);
        g.drawString("RECTANGLE",260,60);
        g.drawRect(215,65,175,125);
        g.drawString("CIRCLE",500,60);
        g.drawOval(460,65,150,150);
        g.drawString("ARC",80,225);
        g.drawArc(30,250,120,120,45,270);
        g.drawString("TRIANGLE",260,225);
        g.drawLine(285,230,210,360);
        g.drawLine(285,230,360,360);
        g.drawLine(210,360,360,360);
        g.drawString("OVAL",500,250);
        g.drawOval(450,265,160,90);
    }
}
