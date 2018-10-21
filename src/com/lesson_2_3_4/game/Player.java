package com.lesson_2_3_4.game;

public class Player {
    private String name;
    private int[] arrayNumbers = new int[10];

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    int[] getArrayNumbers() {
        return arrayNumbers;
    }
}
