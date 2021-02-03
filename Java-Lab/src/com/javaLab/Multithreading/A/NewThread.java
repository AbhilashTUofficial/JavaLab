package com.javaLab.Multithreading.A;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class NewThread implements Runnable {
    int click=0,table;
    Thread t;
    private volatile boolean running=true;
    TextArea txtThread;
    public NewThread(TextArea txtThread, int table,int p){
        this.txtThread=txtThread;
        this.table=table;
        t=new Thread(this);
    }


    @Override
    public void run() {
        while (running){
            click++;
            txtThread.append(click+"x"+table+"="+click*table+"\n");
        }
    }
    public void stop(){
        running=false;
    }
    public void start(){
        txtThread.setText(" ");
        t.start();
    }
}
class MultiThread extends Frame implements ActionListener{
    TextArea txt5,txt7,txt13;
    Button btnStart,btnStop;
    Panel pnlText;
    NewThread New5,New7,New13;
    public MultiThread(){
        setLayout(null);
        btnStart=new Button("START");
        btnStop=new Button("STOP");
        txt5=new TextArea();
        txt7=new TextArea();
        txt13=new TextArea();
        add(txt5);
        add(txt7);
        add(txt13);
        add(btnStart);
        add(btnStop);
        btnStart.addActionListener(this);
        btnStop.addActionListener(this);
        txt5.setBounds(10,30,100,300);
        txt7.setBounds(120,30,100,300);
        txt13.setBounds(230,30,100,300);
        btnStart.setBounds(10,340,160,25);
        btnStop.setBounds(170,340,160,25);
        setTitle("Multithreading");
        setSize(340,380);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnStart){
            New5=new NewThread(txt5,5,Thread.MIN_PRIORITY);
            New7=new NewThread(txt7,7,Thread.NORM_PRIORITY);
            New13=new NewThread(txt13,13,Thread.MAX_PRIORITY);
            New5.start();
            New7.start();
            New13.start();
            btnStart.setEnabled(false);
        }
        else{
            New5.stop();
            New7.stop();
            New13.stop();
            btnStop.setEnabled(true);
        }
    }
    public static void main(String args[]){
        new MultiThread();
    }
}