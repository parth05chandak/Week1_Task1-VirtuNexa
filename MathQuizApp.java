package task2;

import java.util.Random;
import java.util.Scanner;

public class MathQuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalQuestions = 5;
        int correctAnswers = 0;

        System.out.println("Welcome to the Math Quiz!");
        System.out.println("You will be asked " + totalQuestions + " random math problems.");
        System.out.println("Let's begin!\n");

        for (int i = 1; i <= totalQuestions; i++) {
            int operator = random.nextInt(3);
            int num1 = random.nextInt(50) + 1;
            int num2 = random.nextInt(50) + 1;

            int correctAnswer = 0;
            String problem = "";

            switch (operator) {
                case 0:
                    correctAnswer = num1 + num2;
                    problem = num1 + " + " + num2 + " = ?";
                    break;
                case 1:
                    correctAnswer = num1 - num2;
                    problem = num1 + " - " + num2 + " = ?";
                    break;
                case 2:
                    correctAnswer = num1 * num2;
                    problem = num1 + " * " + num2 + " = ?";
                    break;
            }

            System.out.println("Problem " + i + ": " + problem);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!\n");
                correctAnswers++;
            } else {
                System.out.println("Wrong. The correct answer was: " + correctAnswer + "\n");
            }
        }

        System.out.println("Quiz Complete!");
        System.out.println("You answered " + correctAnswers + " out of " + totalQuestions + " questions correctly.");
        double score = (double) correctAnswers / totalQuestions * 100;
        System.out.println("Your score: " + score + "%");

        if (score == 100) {
            System.out.println("Excellent! Perfect score!");
        } else if (score >= 80) {
            System.out.println("Great job!");
        } else if (score >= 50) {
            System.out.println("Good effort, but you can do better!");
        } else {
            System.out.println("Don't worry, keep practicing!");
        }

        scanner.close();
    }
}

