package project1team;

import java.util.Scanner;

public class �ڹ�0602_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("n �Է� : ");
		int n = scan.nextInt();
		int sum = 1;
			
		for (int i = 1; i <= n; i++) {
			System.out.print(sum+" ");
			sum += i;
		}
	}
}
