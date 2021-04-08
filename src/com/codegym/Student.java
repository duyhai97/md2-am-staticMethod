package com.codegym;
public class Student {
    private int rollno;
    private String name;
    private static String collecge  =  "BBDIT";

    Student(int r, String n){
        rollno = r;
        name = n;
    }
    static void change(){
//        collecge = "nha quang";
        System.out.println("hello");
    }

    void display() {
        System.out.println(rollno + " " + name + " " + collecge);
    }
}
