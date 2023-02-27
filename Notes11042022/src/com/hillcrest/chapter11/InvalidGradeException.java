package com.hillcrest.chapter11;

public class InvalidGradeException extends IllegalArgumentException{

    public InvalidGradeException(){

    }

    public InvalidGradeException(String message){
        super(message);
    }

}
