package exam01;

import java.util.Scanner;

public class while반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지 출력하는 프로그램
		// 10보다 큰 수를 입력하면 종료되었습니다. 출력

		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		while (num < 10) {
			System.out.print("정수입력 : ");
			num = scan.nextInt();
		}
		System.out.println("종료되었습니다.");
	}
}
