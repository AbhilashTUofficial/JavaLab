package com.javaLab.Multiple_Selection_Box.A;
import javax.swing.*;
import java.awt.*;

public class MultipleList extends JFrame {
    List list;
    MultipleList(){
        setLayout(new BorderLayout());
        setTitle("Multiple Selection Box");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,350);
        setVisible(true);
        list=new List(9,true);
        add(list,BorderLayout.CENTER);
        list.add("Windows 3.1");
        list.add("Windows 95");
        list.add("Windows NT");
        list.add("Windows 98");
        list.add("Windows ME");
        list.add("Windows XP");
        list.add("Windows 2000");
        list.add("Windows 2003");
    }
    public static void main(String args[]){
        new MultipleList();
    }
}
