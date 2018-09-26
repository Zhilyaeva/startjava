import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
	        
	    String response = "нет"; 

		Scanner scan = new Scanner(System.in); 

		System.out.println ("Программа запущена.");
		
		do {
			System.out.print("Введите первое число: ");
			calculator.setFirstNumber(scan.nextFloat());

			System.out.print("Введите знак математической операции: ");
			calculator.setMathOperation(scan.next());

			System.out.print("Введите второе число: ");
			calculator.setSecondNumber(scan.nextFloat());
		
			calculator.solution();

			System.out.print("Вы хотите продолжить?: ");
			response = scan.next();

		} while (response.equals("да"));
	}
}