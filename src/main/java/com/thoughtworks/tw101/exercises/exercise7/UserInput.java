package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class UserInput {

    private Scanner in;

    public int parse(){
        in = new Scanner(System.in);
        String input = in.nextLine();
        return Integer.parseInt(input);
    }

    public void finish(){
        in.close();
    }
}