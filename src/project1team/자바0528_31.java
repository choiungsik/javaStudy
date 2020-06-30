package project1team;

import java.util.Scanner;

public class 자바0528_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("올 해의 날짜 : ");
		int a = scan.nextInt();
		// 윤년인 년도를 제외한 나머지 년도를 불린으로 표기함
		boolean b = !(a % 4 == 0 && a % 100 > 0) && a % 400 > 0;
		if (b) {
			System.out.println("윤년 아님");
		} else {
			System.out.println("윤년");
		}
	}

}
