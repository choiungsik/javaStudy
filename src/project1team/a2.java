package project1team;

import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("�ѱݾ� �Է� : ");
		int money = scan.nextInt();
		
		System.out.println("�ܵ� : "+money);
		System.out.println("10000�� : "+money/10000+"��");
		System.out.println("5000�� : "+money%10000/5000+"��");
		System.out.println("1000�� : "+money%10000%5000/1000+"��");
		System.out.println("500�� : "+money%10000%5000%1000/500+"��");
		System.out.println("100�� : "+money%10000%5000%1000%500/100+"��");
	}

}
