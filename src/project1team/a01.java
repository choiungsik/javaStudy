package project1team;

import java.util.Scanner;

public class a01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력  : ");
		int num = scan.nextInt();
		
		if (num % 10 >= 5) {
			num += 10-(num%10);
		} else {
			num -= num%10;
		}
		System.out.print("반올림 수 : ");
		System.out.println(num);
	}

}
