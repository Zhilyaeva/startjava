package com.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {

	Scanner scanner = new Scanner(System.in);

	public void start() {

		System.out.print("Введите математическое выражение(например: 1 + 1): ");

		String[] mathExpression = scanner.nextLine().split(" ");

		switch (mathExpression[1]) {
			case "+":
				System.out.println(Float.parseFloat(mathExpression[0]) + Float.parseFloat(mathExpression[2]));
				break;
			case "-":
				System.out.println(Float.parseFloat(mathExpression[0]) - Float.parseFloat(mathExpression[2]));
				break;
			case "*":
				System.out.println(Float.parseFloat(mathExpression[0]) * Float.parseFloat(mathExpression[2]));
				break;
			case "/":
				System.out.println(Float.parseFloat(mathExpression[0]) / Float.parseFloat(mathExpression[2]));
				break;
			case "^":
				System.out.println(Math.pow(Float.parseFloat(mathExpression[0]), Float.parseFloat(mathExpression[2])));
				break;
			case "%":
				System.out.println(Float.parseFloat(mathExpression[0]) % Float.parseFloat(mathExpression[2]));
				break;
			default:
				System.out.println("Данное выражение не поддерживается");
		}	
	}
}