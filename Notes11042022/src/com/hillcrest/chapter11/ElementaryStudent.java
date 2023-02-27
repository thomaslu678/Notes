package com.hillcrest.chapter11;

public class ElementaryStudent extends Student{

    public ElementaryStudent(String name, int grade){
        if(grade < 0|| grade > 5){
            throw new InvalidGradeException(grade + " is not valid for Elementary.");
        }

        setName(name);
        setGrade(grade);

    }

}
