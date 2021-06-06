package com.javaLab.Extracting_A_String.S;
import java.util.Scanner;

public class stringTrim {
    public  static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int startIndex=0,endIndex=0;
        String string ="";
        try{
            System.out.print("Enter the string: ");
            string=input.nextLine();
            System.out.print("Enter the starting index: ");
            startIndex=input.nextInt();
            System.out.print("Enter the ending index: ");
            endIndex=input.nextInt();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Actual string: "+string);
        System.out.println("Trimmed string: "+string.substring(startIndex,endIndex));
    }
}
