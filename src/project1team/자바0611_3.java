package project1team;

import java.util.Scanner;

public class �ڹ�0611_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���� n �Է� : ");
		int num = scan.nextInt();
		System.out.println(isHarshad(num));
	}

	public static boolean isHarshad(int a) {
		int sum = 0;
		int comp = a;

		while (true) {
			sum += a % 10;
			a /= 10;
			if (a < 1) {
				break;
			}
		}

		if (comp % sum == 0) {
			return true;
		} else {
			return false;
		}
	}
}
