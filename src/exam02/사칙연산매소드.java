package exam02;

import java.util.Scanner;

public class ��Ģ����żҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ������ �����ڸ� ���ʴ�� �Է��ϼ���.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		String op = scan.next();
		System.out.println(cal(num1, num2, op));
	}
	public static int cal (int x, int y, String op) {
		int result = 0;
		switch (op) {
		case "+":
			result = x + y;
			break;
		case "-":
			result = x > y ? x - y : y - x;
			break;
		case "*":
			result = x * y;
			break;
		case "/":
			result = x / y;
			break;
		}
		return result;
	}
}
