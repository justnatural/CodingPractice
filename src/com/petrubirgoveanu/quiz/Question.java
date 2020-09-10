package com.petrubirgoveanu.quiz;

import java.util.List;

public class Question {
    String question;
    String correctAnswer;
    List<String> variants;


    public Question(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;

    }

}
