package com.javaLab.To_Append_Text_File.A;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AppendTextFile {
    public static void main(String args[]){
        RandomAccessFile rf;
        try{
            rf=new RandomAccessFile("C:\\programming\\JavaLab\\Java-Lab\\src\\com\\javaLab\\To_Append_Text_File\\A\\file.txt","rw");
            rf.seek(rf.length());
            rf.writeBytes("NCAS");
            rf.close();
            System.out.println();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
