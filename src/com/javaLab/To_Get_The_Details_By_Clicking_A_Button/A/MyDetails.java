package com.javaLab.To_Get_The_Details_By_Clicking_A_Button.A;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDetails extends JFrame implements ActionListener {
    TextField txtName, txtCity, txtStreet, txtPincode;
    Button butMyDetails;
    MyDetails() {
        setLayout(new GridLayout(5, 2));
        txtName = new TextField(25);
        txtStreet = new TextField(25);
        txtCity = new TextField(25);
        txtPincode = new TextField(25);
        butMyDetails = new Button("My Details");
        add(new Label("Name", Label.RIGHT));
        add(txtName);
        add(new Label("Street", Label.RIGHT));
        add(txtStreet);
        add(new Label("City", Label.RIGHT));
        add(txtCity);
        add(new Label("Pincode", Label.RIGHT));
        add(txtPincode);
        add(butMyDetails);
        butMyDetails.addActionListener(this);
        setSize(250, 130);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        txtName.setText("Abhilash Tu");
        txtStreet.setText("none");
        txtCity.setText("Koliyadi");
        txtPincode.setText("1234");
    }
    public static void main(String args[]){
        new MyDetails();
    }
}
