package com.javaLab.Exception.A;

public class PayOutOfBounds extends Exception {
    private int detail;
    PayOutOfBounds(int a){
        detail=a;
    }
    public String toString(){
        return("PayOutOfBounds("+detail+")");
    }
}
class Demo{
    static void compute(int a)throws PayOutOfBounds{
        System.out.println("called compute"+a+")");
        if(a>3000)throw new PayOutOfBounds(a);
        System.out.println("Normal exit");
    }
    public static void main(String[] args){
        try{
            compute(1000);
            compute(4000);
        }
        catch (PayOutOfBounds e){
            System.out.println("Catch"+e);
        }
    }
}
