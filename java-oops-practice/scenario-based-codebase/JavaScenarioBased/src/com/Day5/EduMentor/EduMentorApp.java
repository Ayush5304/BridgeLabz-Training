package com.Day5.EduMentor;

public class EduMentorApp {

    public static void main(String[] args) {

        Learner learner = new Learner("Ayush", "ayush@gmail.com", 101, true);

        Quiz quiz = new Quiz("easy");

        String[] userAnswers = {"4", "Delhi"};
        quiz.submitAnswers(userAnswers);

        System.out.println("Quiz Percentage: " + quiz.getPercentage());

        learner.generateCertificate();
    }
}
