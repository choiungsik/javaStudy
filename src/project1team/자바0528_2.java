package project1team;

import java.util.Scanner;

public class 자바0528_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("현재금액 : ");
		int num1 = scan.nextInt();

		// 계산한 값을 지속해서 이어가서 나머지값을 나눈 몫을 찾음(이건 공식처럼 사용됨)
		System.out.println("잔돈변환");
		System.out.println("10000원 : " + num1 / 10000 + "개");
		System.out.println("5000원 : " + num1 % 10000 / 5000 + "개");
		System.out.println("1000원 : " + num1 % 10000 % 5000 / 1000 + "개");
		System.out.println("500원 : " + num1 % 10000 % 5000 % 1000 / 500 + "개");
		System.out.println("100원 : " + num1 % 10000 % 5000 % 1000 % 500 / 100 + "개");
	}
}
