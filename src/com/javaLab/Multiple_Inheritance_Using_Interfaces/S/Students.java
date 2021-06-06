package com.javaLab.Multiple_Inheritance_Using_Interfaces.S;

public class Students {
    int rollNum;
    void getRollNum(int rollNum){
        this.rollNum=rollNum;
    }
    void putRollNum(){
        System.out.println("Roll number: "+rollNum);
    }
}
class Test extends Students{
    float firstPartMark,secondPartMark;
    void getMark(float firstPartMark, float secondPartMark){
        this.firstPartMark=firstPartMark;
        this.secondPartMark=secondPartMark;
    }
    void putMark(){
        System.out.println("Mark obtained");
        System.out.println("First part marks: "+firstPartMark);
        System.out.println("Second part marks: "+secondPartMark);
        System.out.println("Total marks: "+(firstPartMark+secondPartMark));
    }
}
interface Sports{
    float sportWt=6.0f;
    void putSportWt();
}
class Result extends Test implements Sports{

    @Override
    public void putSportWt() {
        System.out.println("Sport Wt: "+sportWt);
    }
    void display(){
        float totalMark=firstPartMark+secondPartMark+sportWt;
        putRollNum();
        putMark();
        putSportWt();
        System.out.println("Total marks: "+totalMark);
    }
}
class Hybrid{
    public static void main(String[] args){
        Result student1=new Result();
        student1.getRollNum(1);
        student1.getMark(200f,220f);
        student1.display();
    }
}
