package com.petrubirgoveanu.quiz;

import java.util.ArrayList;
import java.util.List;

public class Database {


    private String question1 = "What is the year that the first world war started in?";
    private String q1CorrectAnswer = "1914";
    private List<String> q1Variants = new ArrayList<>();

    private String question2 = "What is the 4th planet from the sun?";
    private String q2CorrectAnswer = "Mars";
    private List<String> q2Variants = new ArrayList<>();

    private Question q1 = new Question(question1, q1CorrectAnswer);
    private Question q2 = new Question(question2, q2CorrectAnswer);

    public Question getQ1() {
        return q1;
    }

    public Question getQ2() {
        return q2;
    }



}
