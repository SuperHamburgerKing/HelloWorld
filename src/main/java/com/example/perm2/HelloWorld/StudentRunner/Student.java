package com.example.perm2.HelloWorld.StudentRunner;

public class Student {
    public static void main(String[] args) {
        StudentGrade.pass = 60;
        GraduateStudent.pass = 70;
        StudentGrade stu = new StudentGrade("ERIC",66,76);
        GraduateStudent stu2 = new GraduateStudent("PIGG",55,79,80);
        stu.grade();
        stu2.grade();
//        System.out.println("成績最高為"+stu.highest());
    }
}
