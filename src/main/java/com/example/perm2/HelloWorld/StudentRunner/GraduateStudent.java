package com.example.perm2.HelloWorld.StudentRunner;

public class GraduateStudent extends StudentGrade{
//    碩士生類別
    int thesis;
    static int pass;
    public GraduateStudent(String name,int math,int english,int thesis){
        super(name, math, english);
        this.thesis = thesis;
    }

    @Override
    public void grade() {
        System.out.print(name+"\t"+"math:"+math+"\t"+"english:"+english+"\t"+
                "thesis:"+thesis+"\t"+
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
}
