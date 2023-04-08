package com.example.counteryquiz35;

public class UserAnswer {
    private int imageResId;
    private int correctAnswer;
    private String userAnswer;

    public UserAnswer(int imageResId, int correctAnswer, String userAnswer) {
        this.imageResId = imageResId;
        this.correctAnswer = correctAnswer;
        this.userAnswer = userAnswer;
    }

    public int getImageResId() {
        return imageResId;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }
}
