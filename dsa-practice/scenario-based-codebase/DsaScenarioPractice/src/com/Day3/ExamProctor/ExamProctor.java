package com.Day3.ExamProctor;

import java.util.*;

class ExamProctor {

    private Stack<Integer> navigationStack;
    private HashMap<Integer, String> answers;
    private HashMap<Integer, String> correctAnswers;

    public ExamProctor() {
        navigationStack = new Stack<>();
        answers = new HashMap<>();
        correctAnswers = new HashMap<>();

        correctAnswers.put(1, "A");
        correctAnswers.put(2, "C");
        correctAnswers.put(3, "B");
    }

    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    public void submitAnswer(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    public void goBack() {
        if (!navigationStack.isEmpty()) {
            int last = navigationStack.pop();
            System.out.println("Back from Question: " + last);
        } else {
            System.out.println("No previous questions.");
        }
    }

    public int calculateScore() {
        int score = 0;

        for (int qId : correctAnswers.keySet()) {
            if (answers.containsKey(qId) &&
                answers.get(qId).equals(correctAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }
}
