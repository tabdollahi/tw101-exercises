package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    private int hitPoints = 40;
    private String name = "Troll";

    public void takeDamage(int amount) {
        hitPoints += amount/2;
    }

    public void reportStatus() {
        System.out.println(String.format("Name: %s, Current Damage: %s", name, hitPoints));
    }
}
