package com.javaLab.Menu_Events.A;
import javax.swing.*;
import java.awt.*;

public class MenuDemo extends JFrame{
    public MenuDemo(){
        setTitle("Menu Bar And Pull Down Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300,250);
        MenuBar mBar=new MenuBar();
        setMenuBar(mBar);
        Menu file=new Menu("File");
        file.add(new MenuItem("New"));
        file.add(new MenuItem("Open"));
        file.addSeparator();
        file.add(new MenuItem("Save"));
        file.addSeparator();
        file.add(new MenuItem("Quit"));
        Menu edit=new Menu("Edit");
        edit.add(new MenuItem("Cut"));
        edit.addSeparator();
        edit.add(new MenuItem("Copy"));
        edit.addSeparator();
        edit.add(new MenuItem("Paste"));
        edit.addSeparator();
        edit.add(new MenuItem("Delete"));
        mBar.add(file);
        mBar.add(edit);
    }
    public static void main(String args[]){
        new MenuDemo();
    }
}
