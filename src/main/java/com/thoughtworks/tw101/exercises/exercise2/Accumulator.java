package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int incrementCount = 0;

    public void increment(){
        incrementCount+=1;
    }
    public void total(){
        System.out.println(incrementCount);
    }
}
