import java.util.Scanner; // Было в задачах в материалах про ветвление в Java
public class MyFirstGame {
	public static void main(String[] args) {
		int magic = 99;
		System.out.print ("Введи число от 1 до 100: "); 
		Scanner  num = new Scanner (System.in); 
		int i = num.nextInt (); 
		if (i == magic) {
			System.out.println ("Ты угадал. Ты сильное звено!");
		}
		else if ( i < magic && i >= 1 ) {
			System.out.println ("Мое число больше");
		}
		else if ( i > magic && i <= 100 ) {
			System.out.println ("Мое число меньше");
		}
		else {
			System.out.println ("Засранец! Играй по правилам!");
		}
	}
}