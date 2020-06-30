package project1team;

public class ÀÚ¹Ù0609_2 {

	public static int cal (int x, int y, char op) {
		int result = 0;
		switch (op) {
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		case '*':
			result = x * y;
			break;
		case '/':
			result = x / y;
			break;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 50;
		int num2 = 15;
		char op = '+';
		System.out.println(cal(num1, num2, op));
	}

}
