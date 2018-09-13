public class Calculator {
public static void main(String[] args) {
int x = 15;
int y = 3;
char mathem = '^';

if (mathem == '+'){
	System.out.println(x + y);
}
else if (mathem == '-'){
	System.out.println(x - y);
}
else if (mathem == '*'){
	System.out.println(x * y);
}
else if (mathem == '/'){
	System.out.println(x / y);
}
else if (mathem == '^'){
	int result = 1;
	for (int i = 1; i <= y; i++){
		result = result*x;
	}
	System.out.println(result);
}
else if (mathem == '%'){
	System.out.println(x % y);
}
}
	
}