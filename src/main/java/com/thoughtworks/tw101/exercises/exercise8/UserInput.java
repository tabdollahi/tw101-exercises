package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

public class UserInput {

    private Scanner in = new Scanner(System.in);
    private int userInput;

    public int getInt(){
        parse();
        return userInput;
    }

    private void parse(){
        String input = in.nextLine();

        try {
            userInput = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("You have entered an invalid character. Please enter a number.");
            parse();
        }
    }

    public void finish(){
        in.close();
    }
}