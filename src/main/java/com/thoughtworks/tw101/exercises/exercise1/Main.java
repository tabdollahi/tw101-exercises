package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        printOddNums(1,100);
    }

    private static void printOddNums (int start, int end){
        int sum = 0;
        for (int i = start; i < end; i++){
            if (i%2!=0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
