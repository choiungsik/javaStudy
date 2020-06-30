package exam02;

import java.util.Scanner;

public class 자판기프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int money = scan.nextInt();

		System.out.println("메뉴를 고르세요.");
		System.out.println("1. 콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원) >> ");
		int menu = scan.nextInt();
		int cost = 0;
		switch (menu) {
		case 1:
			cost = 800;
			break;
		case 2:
			cost = 500;
			break;
		case 3:
			cost = 1500;
			break;
		}

		if (money >= cost) {
			System.out.println("잔돈 : " + (money - cost));
		} else {
			System.out.println("잔돈 : " + money);
			System.out.println("돈이 부족해요.");
		}
	}

}
