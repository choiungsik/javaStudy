package exam03;

import java.util.Scanner;

public class 마름모만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("마름모의 절반길이 입력 : ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = n + i; j >= n - i; j--) {
				System.out.print("@");
			}
			System.out.println();

		}
		for (int i = n; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = n + i; j >= n - i; j--) {
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
