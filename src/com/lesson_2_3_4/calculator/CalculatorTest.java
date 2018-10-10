package com.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in); 
		String response;

		System.out.println ("Программа запущена.");

		do {
			calculator.start();

			do {
				System.out.print("Вы хотите продолжить?: ");
				response = scan.nextLine();
			} while (!response.equals("да") && !response.equals("нет"));

		} while (!response.equals("нет"));
	}
}