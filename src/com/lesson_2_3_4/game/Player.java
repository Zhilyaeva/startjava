package com.lesson_2_3_4.game;

public class Player {
    private String name;
    int[] numbers = new int[10];

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}