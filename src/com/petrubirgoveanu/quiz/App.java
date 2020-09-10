package com.petrubirgoveanu.quiz;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class App {

    static Database database = new Database();

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println(database.getQ1().question);
        String answerToQ1 = userInput.nextLine();
        isUserAnswerCorrect(answerToQ1, database.getQ1().correctAnswer);

        System.out.println(database.getQ2().question);
        String answerToQ2 = userInput.nextLine();
        isUserAnswerCorrect(answerToQ2, database.getQ2().correctAnswer);
    }

    public static void isUserAnswerCorrect(String userAnswer, String correctAnswer) {

        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }

    }
}
