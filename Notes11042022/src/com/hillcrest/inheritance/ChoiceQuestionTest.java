package com.hillcrest.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChoiceQuestionTest {

    @Test
    public void testAskQuestion_oneChoice(){
        ChoiceQuestion question = getChoiceQuestion();
        String expected = "What is the first day of the week?\n" +
                    "\tMonday\n" + 
                    "\tTuesday\n" + 
                    "\tFriday\n";
        Assertions.assertEquals(expected, question.askQuestion());

    }

    private static ChoiceQuestion getChoiceQuestion() {
        ChoiceQuestion question = new ChoiceQuestion();
        question.setQuestion("What is the first day of the week?");
        question.addChoice("Monday", true);
        question.addChoice("Tuesday", false);
        question.addChoice("Friday", false);
        return question;
    }

    @Test
    public void testCheckAnswer_correct(){
        ChoiceQuestion question = getChoiceQuestion();
        Assertions.assertTrue(question.checkAnswer("Monday"));
    }

    @Test
    public void testCheckAnswer_incorrect(){
        ChoiceQuestion question = getChoiceQuestion();
        Assertions.assertFalse(question.checkAnswer("Tuesday"));
    }

}
