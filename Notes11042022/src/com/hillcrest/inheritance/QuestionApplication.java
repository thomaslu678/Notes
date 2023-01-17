package com.hillcrest.inheritance;

import java.util.Scanner;

public class QuestionApplication{

    public static void main(String[] args) {
        Question first = new Question();
        first.setQuestion("What is today?");
        first.setAnswer("Tuesday");

        ChoiceQuestion second = new ChoiceQuestion("Which month does not have 31 days?");
        second.addChoice("January", false);
        second.addChoice("July", false);
        second.addChoice("December", false);
        second.addChoice("June", true);

        displayQuestion(first);
        displayQuestion(second);
    }

    public static void displayQuestion(Question question){

        System.out.println(question.askQuestion());
        System.out.print("Your answer: ");
        var in = new Scanner(System.in);
        var answer = in.nextLine();
        var wasCorrect = question.checkAnswer(answer);
        if(wasCorrect){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Sorry, incorrect");
        }

    }



}
