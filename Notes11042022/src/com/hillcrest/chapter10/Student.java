package com.hillcrest.chapter10;

public class Student implements Measurable, Comparable<Student>{

    private String name;
    private double gpa;
    private int age;
    private String grade;

    public Student(String name, double gpa, int age, String grade) {
        this.name = name;
        this.gpa = gpa;
        this.age = age;
        this.grade = grade;
    }

    public double getMeasure(){
        return gpa;
    }


    @Override
    public int compareTo(Student o) {
        if(this.gpa < o.gpa){
            return 1;
        }
        else if (this.gpa == o.gpa) {
            return 0;
        }
        else{
            return -1;
        }
    }
}
