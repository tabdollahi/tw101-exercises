package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    private int hitPoints = 20;
    private String name = "Orc";

    public void takeDamage(int amount) {
        hitPoints += amount;
    }

    public void reportStatus() {
        System.out.println(String.format("Name: %s, Current Damage: %s", name, hitPoints));
    }
}
