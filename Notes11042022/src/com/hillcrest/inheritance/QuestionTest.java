package com.hillcrest.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuestionTest {

    @Test
    public void testQuestion(){
        Question q = new Question();
        Assertions.assertEquals("", q.askQuestion());
    }

    @Test
    public void testAnswer(){
        Question q = new Question();
        q.setAnswer("Homer Simpson");
        Assertions.assertTrue(q.checkAnswer("homer simpson"));
    }



}
