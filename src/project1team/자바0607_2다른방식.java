package project1team;

import java.util.Scanner;

public class 자바0607_2다른방식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 크기 입력 : ");
		int n = scan.nextInt();
		
		System.out.println("90도 회전");
		for (int i = n; i > 0 ; i--) {
			int num = i;
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d ", num);
				num += n;
			}
			System.out.println();
		}
	}

}
