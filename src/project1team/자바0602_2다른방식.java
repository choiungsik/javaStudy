package project1team;

import java.util.Scanner;

public class 자바0602_2다른방식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("행 갯수 : ");
		int n = scan.nextInt();
		while (n > 0) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
			n--;
		}
	}
}
