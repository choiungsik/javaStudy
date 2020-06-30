package exam02;

import java.util.Scanner;

public class 다이어트관리프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int n_wei = scan.nextInt();
		System.out.print("목표 몸무게 : ");
		int g_wei = scan.nextInt();
		int count = 0;
		while (true) {
			count++;
			System.out.print(count + "주차 감량 몸무게 : ");
			int l_wei = scan.nextInt();
			n_wei -= l_wei;
			if (n_wei <= g_wei) {
				System.out.println(n_wei + "kg 달성!! 축하합니다!!");
				break;
			}
		}
	}

}
