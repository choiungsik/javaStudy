package project1team;

import java.util.Scanner;

public class 자바0610_2다른방식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int num = scan.nextInt();
		int sum = 0;

		while (true) {
			int n = num % 10;
			if (num < 1) {     // break 조건이 앞에 있어야 별도의 다른 작업 없이 바로 나옴 나중에 유의하자!
				System.out.println("대시'-'의 총 합 >> " + sum);
				break;
			}
			if (n == 1) {
				sum += 2;
			} else if (n == 7) {
				sum += 3;
			} else if (n == 4) {
				sum += 4;
			} else if (n == 2 || n == 3 || n == 5) {
				sum += 5;
			} else if (n == 0 || n == 6 || n == 9) {
				sum += 6;
			} else {
				sum += 7;
			}
			num /= 10;
		}
	}

}
