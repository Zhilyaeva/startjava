package com.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String response;

        System.out.println ("Программа запущена.");

        do {
            System.out.print("Введите математическую операцию (например: 2 + 2): ");
            Calculator calculator = new Calculator(scan.nextLine());
            calculator.solution();

            do {
                System.out.print("Вы хотите продолжить?: ");
                response = scan.nextLine();
            } while (!response.equals("да") && !response.equals("нет"));

        } while (!response.equals("нет"));
    }
}