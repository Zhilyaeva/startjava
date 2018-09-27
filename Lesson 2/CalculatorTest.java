import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in); 
		Scanner scanLine = new Scanner(System.in);
		String response;

		System.out.println ("Программа запущена.");

		do {
			System.out.print("Введите первое число: ");
			calculator.setFirstNumber(scan.nextFloat());

			System.out.print("Введите знак математической операции: ");
			calculator.setMathOperation(scanLine.nextLine());

			System.out.print("Введите второе число: ");
			calculator.setSecondNumber(scan.nextFloat());
		
			System.out.print("Ответ: ");
			calculator.solution();

			do {
			System.out.print("Вы хотите продолжить?: ");
			response = scanLine.nextLine();
			} while (!response.equals("да") && !response.equals("нет"));

		} while (!response.equals("нет"));
	}
}