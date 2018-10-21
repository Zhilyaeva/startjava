package com.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer;

        System.out.println ("Программа запущена.");

        do {
            System.out.print("Введите математическую операцию (например: 2 + 2): ");
            calculator.setInputExpression(scan.nextLine());
            calculator.calculate();

            do {
                System.out.print("Вы хотите продолжить?: ");
                answer = scan.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));

        } while (!answer.equals("нет"));
    }
}