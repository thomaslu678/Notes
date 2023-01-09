package com.hillcrest.inheritance;

import com.hillcrest.random.MonteCarloTester;

import java.util.ArrayList;

public class ChoiceQuestion extends Question{

    private ArrayList<String> choices;
    public ChoiceQuestion(){
        this.choices = new ArrayList<>();
    }

    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        if(correct){
            setAnswer(choice);
        }
    }

    public String askQuestion(){
        StringBuilder builder = new StringBuilder();
        builder.append(super.askQuestion())
                .append("\n");
        for(var choice : choices){
            builder.append("\t");

        }
        return null;
    }

}
