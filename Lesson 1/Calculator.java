public class Calculator {
	public static void main(String[] args) {
	int x = 15;
	int y = 3;
	char mathOperation = '^';

	if (mathOperation == '+') {
		System.out.println(x + y);
	} else if (mathOperation == '-') {
		System.out.println(x - y);
	} else if (mathOperation == '*') {
		System.out.println(x * y);
	} else if (mathOperation == '/') {
		System.out.println(x / y);
	} else if (mathOperation == '^') {
 		
 		int result = 1;
		for (int i = 1; i <= y; i++) {
			result *= x;
		}
			System.out.println(result);
		} else if (mathOperation == '%') {
			System.out.println(x % y);
		}
	}
}