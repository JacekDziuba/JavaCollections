package com.MapAndSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class QuestionAndAnswerMain {

    public static void main(String[] args) {

        Map<Integer, QuestionAndAnswer> quiz = new HashMap<>();

        quiz.put(0, new QuestionAndAnswer("Who is Luke's father?", "LORD VADER"));
        quiz.put(1, new QuestionAndAnswer("Who is the president of the US ?", "DONALD TRUMP"));
        quiz.put(2, new QuestionAndAnswer("Who sang 'Nas is like'?", "NAS"));
        quiz.put(3, new QuestionAndAnswer("What rules everything around me ?", "CASH"));

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("To quit, type 'Q'");

        while (true) {
            int number = random.nextInt(quiz.size());

            System.out.println("System chose question: " + number);
            System.out.println(quiz.get(number).getQuestion());
            System.out.println("What is your answer ?");

            String answer = scanner.nextLine().toUpperCase();

            if (answer.equals("Q")) {
                System.out.println("Game Over");
                break;
            }

            if (quiz.get(number).getAnswer().equals(answer)) {
                System.out.println("Correct answer");
            } else {
                System.out.println("You are wrong. Keep trying");
            }

        }
    }


}
