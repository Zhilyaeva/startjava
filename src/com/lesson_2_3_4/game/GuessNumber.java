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
        System.out.println("Загаданное компьютером число: " + compNumber);
        System.out.println("У вас есть 10 попыток.");
        isWin = false;

        for (int i = 0; i < 10; i++) {
            attempt = i;
//          System.out.println("Попытка №:" + (i + 1));
            inputNumber(playerOne);
            inputNumber(playerTwo);
            checkInput(playerOne);
            checkInput(playerTwo);
            if (isWin) {
                printResult(playerOne);
                printResult(playerTwo);
                break;
            }
        }

        if (attempt == 9) {
            printResult(playerOne);
            printResult(playerTwo);
        }
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число от 0 до 100: ");
        player.numbers[attempt] = scan.nextInt();
    }

    private void checkInput(Player player) {
        if (player.numbers[attempt] == compNumber) {
            System.out.println(player.getName() + ", Вы угадали с " + (attempt + 1) + " попытки, это число: " + compNumber);
            isWin = true;
        } else if (player.numbers[attempt] < compNumber && player.numbers[attempt] >= 0) {
            System.out.println(player.getName() + ", введенное Вами число меньше загаданного компьютером");
        } else if (player.numbers[attempt] > compNumber && player.numbers[attempt] <= 100) {
            System.out.println(player.getName() + ", введенное Вами число больше загаданного компьютером");
        } else {
            System.out.println(player.getName() + ", сосиска, не пытайся меня обмануть!");
        }
    }

    private void printResult(Player player) {
        if (attempt==9) {
            System.out.println(player.getName() + ", у вас закончились попытки :(");
            }
        System.out.print("Выбранные числа игрока " +  player.getName() + ": ");
        int[] resultNumbers = Arrays.copyOf(player.numbers, attempt + 1);
        for (int i = 0; i < resultNumbers.length; i++) {
            System.out.print(resultNumbers[i] + " ");
        }
        Arrays.fill(player.numbers, 0);
    }
}