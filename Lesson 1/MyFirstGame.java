import java.util.Scanner; // Было в задачах в материалах про ветвление в Java

public class MyFirstGame {
	public static void main(String[] args) {
		int secretNumber = 99;
		System.out.print("Введи число от 0 до 100: "); 
		Scanner answer = new Scanner(System.in); 
		int answerNumber = answer.nextInt(); 

		if (answerNumber == secretNumber) {
			System.out.println("Ты угадал. Ты сильное звено!");
		} else if ( answerNumber < secretNumber && answerNumber >= 0 ) {
			System.out.println("Мое число больше");
		} else if ( answerNumber > secretNumber && answerNumber <= 100 ) {
			System.out.println("Мое число меньше");
		} else {
			System.out.println("Засранец! Играй по правилам!");
		}
	}
}