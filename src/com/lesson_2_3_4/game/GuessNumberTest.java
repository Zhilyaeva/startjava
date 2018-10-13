package com.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
    	String userAnswer;
        Scanner scan = new Scanner(System.in);

        System.out.print("Первый игрок, введите ваше имя: ");
        Player playerOne = new Player(scan.nextLine());
        System.out.print("Второй игрок, введите ваше имя: ");
        Player playerTwo = new Player(scan.nextLine()); 
        
        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);  

        do {     
            guessNumber.start();
            
            do {
                System.out.print("Хотите сыграть еще раз? ");
                userAnswer = scan.nextLine();
            } while (!userAnswer.equals("да") && !userAnswer.equals("нет"));
        
        } while (userAnswer.equals("да"));
    }
}