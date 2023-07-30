package com.example.perm2.HelloWorld.StudentRunner;

import jdk.dynalink.beans.StaticClass;

public class StudentGrade {
//    學士生類別
    String name;
    int math;
    int english;
    static int pass;
    public StudentGrade(String name,int math,int english) {
        this.math = math;
        this.name = name;
        this.english = english;
    }
    public void grade(){
        System.out.print(name+"\t"+"math:"+math+"\t"+"english:"+english+"\t"+
                "平均成績為"+getAverage());
        if(getAverage()>pass) {
            System.out.println("\tPASS");
        }else{
                System.out.println(("\tFALL"));
            }
        int average = getAverage();
        char grading = 'D';
        switch (average/10){
            case 10:
                case 9: grading = 'A';
                break;
            case 8: grading = 'B';
            break;
            case 7: grading = 'C';
            break;
            default: grading = 'D';break;
        }
        System.out.println("成績評比為:"+grading);
    }
    public int highest(){
        int max = (english>math)? english:math;
        return max;
    }
    public int getAverage(){
        return (math+english)/2;
    }
}
