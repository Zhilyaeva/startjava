package com.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in); 
		String response;

		System.out.println ("Программа запущена.");

		do {
			System.out.print("Введите первое число: ");
			calculator.setFirstNumber(scan.nextFloat());
			scan.nextLine();
			
			System.out.print("Введите знак математической операции: ");
			calculator.setMathOperation(scan.nextLine());

			System.out.print("Введите второе число: ");
			calculator.setSecondNumber(scan.nextFloat());
			scan.nextLine();
		
			System.out.print("Ответ: ");
			calculator.solution();

			do {
				System.out.print("Вы хотите продолжить?: ");
				response = scan.nextLine();
			} while (!response.equals("да") && !response.equals("нет"));

		} while (!response.equals("нет"));
	}
}