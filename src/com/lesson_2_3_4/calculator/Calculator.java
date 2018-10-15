package com.lesson_2_3_4.calculator;

public class Calculator {

    private String inputExpression;

    public Calculator(String inputExpression) {
        this.inputExpression = inputExpression;
    }

    public void calculate() {
        String[] mathExpression = inputExpression.split(" ");
        int firstNumber = Integer.parseInt(mathExpression[0]);
        int secondNumber = Integer.parseInt(mathExpression[2]);

        switch (mathExpression[1]) {
            case "+":
                System.out.println(Math.addExact(firstNumber, secondNumber));
                break;
            case "-":
                System.out.println(Math.subtractExact(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println(Math.multiplyExact(firstNumber, secondNumber));
                break;
            case "/":
                System.out.println((float) firstNumber / secondNumber);
                break;
            case "^":
                System.out.println(Math.pow(firstNumber, secondNumber));
                break;
            case "%":
                System.out.println(Math.floorMod(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Данное выражение не поддерживается");
        }
    }
}