package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student a = new Student(1,"thanh");
        Student b = new Student(1,"ha");
        Student c = new Student(1,"hai");

        a.display();
        b.display();
        c.display();
    }
}
