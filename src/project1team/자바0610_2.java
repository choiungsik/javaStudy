package project1team;

import java.util.Scanner;

public class 자바0610_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int num = scan.nextInt();
		int sum = 0;

		while (true) {
			int n = num % 10;
			num /= 10;
			switch (n) {
			case 0:
			case 6:
			case 9:
				sum += 6;
				break;
			case 1:
				sum += 2;
				break;
			case 2:
			case 3:
			case 5:
				sum += 5;
				break;
			case 4:
				sum += 4;
				break;
			case 7:
				sum += 3;
				break;
			case 8:
				sum += 7;
				break;
			}
			if (num < 1) {
				System.out.print("대시('-')의 총 합 >>" + sum);
				break;
			}
		}

	}

}
