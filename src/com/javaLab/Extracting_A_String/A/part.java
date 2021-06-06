package com.javaLab.Extracting_A_String.A;
import java.io.DataInputStream;

public class part{
    public static void main(String[] args){
        DataInputStream in = new DataInputStream(System.in);
        int n1 = 0;
        int n2 = 0;
        String str = "";
        try {
            System.out.println("Enter string ");
            str = in.readLine();
            System.out.println("Enter the starting number of the string ");
            n1 = Integer.parseInt(in.readLine());
            System.out.println("Enter the ending of the string ");
            n2 = Integer.parseInt(in.readLine());
        } catch (Exception e) {
        }
        System.out.println("Actual string is " + str);
        System.out.println("Actual string is " + str.substring(n1, n2));
    }
}
