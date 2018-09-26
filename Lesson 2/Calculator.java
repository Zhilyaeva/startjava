public class Calculator {

	private float firstNumber;
	private String mathOperation;
	private float secondNumber;

	public void setFirstNumber(float firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setMathOperation(String mathOperation) {
		this.mathOperation = mathOperation;
	}
	
	public void setSecondNumber(float secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void solution() {
		switch (mathOperation) {
			case "+":
				System.out.println (firstNumber + secondNumber);
				break;
			case "-":
				System.out.println (firstNumber - secondNumber);
				break;
			case "*":
				System.out.println (firstNumber * secondNumber);
				break;
			case "/":
				System.out.println (firstNumber / secondNumber);
				break;
			case  "^":
				int result = 1;
				for (int i = 1; i <= secondNumber; i++) {
					result *= firstNumber;
				}
				System.out.println (result);
				break;
			case "%":
				System.out.println (firstNumber % secondNumber);
				break;
			default:
				System.out.println ("Неверный математически знак.");
		}	
	}
}