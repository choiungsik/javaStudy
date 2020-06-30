package exam02;

import java.util.Scanner;

public class 홀짝구분 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();

		switch (num % 2) {
		case 1:
			System.out.println("홀수입니다!");
			break;

		default:
			System.out.println("짝수입니다!");
			break;
		}

	}
}
