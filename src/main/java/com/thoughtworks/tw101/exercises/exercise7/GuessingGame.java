package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

public class GuessingGame {
    private int correctAnswer;
    private int min;
    private int max;
    private int currentGuess;
    private UserInput input;

    public GuessingGame(int min, int max){
        this.min = min;
        this.max = max;
        Random rand = new Random();
        correctAnswer = rand.nextInt(max) + min;
        input = new UserInput();
    }

    public void start() {
        System.out.println("Please guess a number between " + min + " and " + max + ".");
        setCurrentGuess();
    }

    public void checkForCorrect(){
        if (currentGuess == correctAnswer) {
            input.finish();
            System.out.println("Congratulations! You've won the game!");
        }
        else {
            guessAgain();
        }
    }

    private void guessAgain(){
        if (currentGuess < correctAnswer) {
            System.out.println("Your guess is too low. Please enter another guess:");
        }
        else {
            System.out.println("Your guess is too high. Please enter another guess:");
        }
        setCurrentGuess();
        checkForCorrect();
    }

    private void setCurrentGuess(){
        currentGuess = input.parse();
    }
}
