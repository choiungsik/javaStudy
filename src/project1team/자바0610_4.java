package project1team;

import java.util.Scanner;

public class �ڹ�0610_4 {

	public static int fibo(int x) {
		int sum = 1;
		if (x>2) {
		sum = fibo(x-1) + fibo(x-2);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("������ ���� input �Է� : ");
		int input = scan.nextInt();
		for (int i = 1; i <= input; i++) {
			System.out.print(fibo(i) + " ");
		}

	}

}
