package exam02;

import java.util.Scanner;

public class 별반복출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("반복 횟수 입력 : ");
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}

}
