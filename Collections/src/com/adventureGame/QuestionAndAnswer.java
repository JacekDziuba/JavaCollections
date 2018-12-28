package com.adventureGame;

public class QuestionAndAnswer {

    // == fields ==

    private final String question;
    private final String answer;

    // == constructors ==

    public QuestionAndAnswer(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    // == getters ==

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
