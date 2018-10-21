package com.lesson_2_3_4.game;

public class Player {
    private String name;
    private int[] arrayNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getArrayNumbers() {
        return arrayNumbers;
    }
}
