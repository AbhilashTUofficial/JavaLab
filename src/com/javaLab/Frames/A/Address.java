package com.javaLab.Frames.A;
import javax.swing.*;
import java.awt.*;

public class Address extends JFrame {
    TextField txtName,txtAge,txtQualification;
    TextArea txtAddress;
    Address(){
        setLayout(new GridLayout(5,2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(250,130);
        txtName=new TextField(25);
        txtAge=new TextField(25);
        txtQualification=new TextField(25);
        txtAddress=new TextArea();
        add(new Label("NAME",Label.RIGHT));
        add(new Label("AGE",Label.RIGHT));
        add(new Label("QUALIFICATION",Label.RIGHT));
        add(new Label("ADDRESS",Label.RIGHT));
        add(txtName);
        add(txtAddress);
        add(txtAge);
        add(txtQualification);
    }
    public static void main(String args[]){
        new Address();
    }
}
