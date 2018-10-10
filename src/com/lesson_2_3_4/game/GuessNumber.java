package com.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int compNumber;
    private boolean isWin;
    private Scanner scan = new Scanner(System.in);
    
    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
    compNumber = (int)(Math.random() * 101);
    //System.out.println("Загаданное компьютером число: " + compNumber);
        do {
            inputNumber(playerOne);
            inputNumber(playerTwo);
            selectNumber(playerOne);
            selectNumber(playerTwo);
        } while (!isWin);
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число от 0 до 100: ");
        player.setNumber(scan.nextInt());
    }

    private void selectNumber(Player player) {
        if (player.getNumber() == compNumber) {
            System.out.println(player.getName() + ", Вы угадали, это число: " + player.getNumber());
            isWin = true;
        } else if (player.getNumber() < compNumber && player.getNumber() >= 0) {
            System.out.println(player.getName() + ", введенное Вами число меньше загаданного компьютером");
        } else if (player.getNumber() > compNumber && player.getNumber() <= 100) {
            System.out.println(player.getName() + ", введенное Вами число больше загаданного компьютером");
        } else {
            System.out.println(player.getName() + ", сосиска, не пытайся меня обмануть!");
        } 
    }
}