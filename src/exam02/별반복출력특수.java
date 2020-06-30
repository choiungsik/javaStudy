package exam02;

import java.util.Scanner;

public class 별반복출력특수 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("반복할 횟수 : ");
		int num = scan.nextInt();
		
		for (int  j = 1; j <= num; j++) {
			for (int i = num; i >= j; i--) {
				System.out.print("@");
			}
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
