package exam01;

import java.util.Scanner;

public class for문반복 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1부터 10까지 출력하는 반복문
		// i는 for문 안에서만 사용 가능한 지역변수
		for (int i = 2; i <= 9; i++) {
			System.out.println("====" + i + "단====");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (j * i));
			}
			System.out.println();
		}
	}

}
