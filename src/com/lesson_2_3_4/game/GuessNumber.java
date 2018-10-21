package com.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int compNumber;
    private boolean isWin;
    private int attempt;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        compNumber = (int) (Math.random() * 101);
//        System.out.println("Загаданное компьютером число: " + compNumber);
        System.out.println("У вас есть 10 попыток.");
        isWin = false;

        for (int i = 1; i < 11; i++) {
            attempt = i;
//          System.out.println("Попытка №:" + i);
            inputNumber(playerOne);
            inputNumber(playerTwo);
            checkInput(playerOne);
            checkInput(playerTwo);
            if (isWin) {
                break;
            }
        }

        if (attempt == 10) {
            System.out.println(playerOne.getName() + ", у вас закончились попытки :(");
            System.out.println(playerTwo.getName() + ", у вас закончились попытки :(");
        }

        printResultArray(playerOne);
        printResultArray(playerTwo);
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число от 0 до 100: ");
        player.getArrayNumbers()[attempt - 1] = scan.nextInt();
    }

    private void checkInput(Player player) {
        if (player.getArrayNumbers()[attempt - 1] == compNumber) {
            System.out.println(player.getName() + ", Вы угадали с " + (attempt) + " попытки, это число: " + compNumber);
            isWin = true;
        } else if (player.getArrayNumbers()[attempt - 1] < compNumber && player.getArrayNumbers()[attempt - 1] >= 0) {
            System.out.println(player.getName() + ", введенное Вами число меньше загаданного компьютером");
        } else if (player.getArrayNumbers()[attempt - 1] > compNumber && player.getArrayNumbers()[attempt - 1] <= 100) {
            System.out.println(player.getName() + ", введенное Вами число больше загаданного компьютером");
        } else {
            System.out.println(player.getName() + ", сосиска, не пытайся меня обмануть!");
        }
    }

    private void printResultArray(Player player) {
        System.out.print("Выбранные числа игрока " +  player.getName() + ": ");
        int[] resultNumbers = Arrays.copyOf(player.getArrayNumbers(), attempt);
        for (int i = 0; i < resultNumbers.length; i++) {
            System.out.print(resultNumbers[i] + ", ");
        }
        Arrays.fill(player.getArrayNumbers(), 0);
    }
}