public class Calculator {
	public static void main(String[] args) {
	int x = 15;
	int y = 3;
	char mathFunction = '^';

		if (mathFunction == '+') {
			System.out.println(x + y);
		} else if (mathFunction == '-') {
			System.out.println(x - y);
		} else if (mathFunction == '*') {
			System.out.println(x * y);
		} else if (mathFunction == '/') {
			System.out.println(x / y);
		} else if (mathFunction == '^') {
 		
 		int result = 1;
		for (int i = 1; i <= y; i++) {
		result *= x;
		}
			System.out.println(result);
		} else if (mathFunction == '%') {
			System.out.println(x % y);
		}
	}
	
}