package com.hillcrest.inheritance;

import java.util.ArrayList;

public class ChoiceQuestion extends Question{

    private ArrayList<String> choices;
    public ChoiceQuestion(String question){
        super(question); // Knows which constructor to call, calls the one with a String
        this.choices = new ArrayList<>();
    }

    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        if(correct){
            //answer = choice; //cannot access private variables
            setAnswer(choice);
        }
    }

    public String askQuestion() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.askQuestion())
                .append("\n");
        for (var choice : choices) {
            builder.append("\t")
                    .append(choice)
                    .append("\n");

        }
        return builder.toString();
    }
}
