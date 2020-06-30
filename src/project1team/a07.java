package project1team;

import java.util.Scanner;

public class a07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("최대공약수 & 최소공배수 구하기");
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1 입력 >> ");
		int num1 = scan.nextInt();
		System.out.print("숫자2 입력 >> ");
		int num2 = scan.nextInt();
		
		int max = 0;
		int min = 0;
		
		for (int i = num1; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i ==0) {
				System.out.println("최대공약수 : "+i);
				max = i;
				break;
			}
		}
		System.out.println("최소공배수 : "+(num1*num2/max));
	}

}
