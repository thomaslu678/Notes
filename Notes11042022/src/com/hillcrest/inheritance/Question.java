package com.hillcrest.inheritance;

/**
 * A question with answer
 */
public class Question {

    private String question;
    private String answer;

    /**
     * Constructs a question with an empty question and answer
     */
    public Question() {
        this.question = "";
        this.answer = "";
    }

    /**
     * Set the question for this question
     * @param question the text for this question
     */
    public void setQuestion(String question){
        this.question = question;
    }

    /**
     * The answer for this question
     * @param answer the correct answer
     */
    public void setAnswer(String answer){
        this.answer = answer;
    }

    /**
     * Check if the user answer is correct
     * @param response the user's response
     * @return true if the user entered the correct answer
     */
    public boolean checkAnswer(String response){
        return answer.equalsIgnoreCase(response);
    }

    /**
     * Asks the question
     * @return the question
     */
    public String askQuestion(){
        return question;
    }

}
