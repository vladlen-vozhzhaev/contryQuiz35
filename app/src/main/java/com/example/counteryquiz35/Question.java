package com.example.counteryquiz35;

public class Question {
    private int imageResId;
    private int correctAnswer;

    public Question(int imageResId, int correctAnswer) {
        this.imageResId = imageResId;
        this.correctAnswer = correctAnswer;
    }

    public int getImageResId() {
        return imageResId;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
