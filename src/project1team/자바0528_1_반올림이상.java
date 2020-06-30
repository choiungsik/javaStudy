package project1team;

import java.util.Scanner;

public class 자바0528_1_반올림이상 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner라는 함수를 통해 값 입력받기
		// scan이라는 변수를 사용할 때마다 새로운 Scanner를 생성하도록 만듬
		// 필요한 값을 system에서 in입력 받도록 설정
		Scanner scan = new Scanner(System.in);

		System.out.print("반올림 전 값 : ");
		int num1 = scan.nextInt();

		// Math.round로 10으로 나눈 것을 소수점 반올림
		// int를 통해서 강제로 정수형태로 잡음, 다시 곱해서 원래값으로 전환
		System.out.println("반올림 후 값 : " + (int) Math.round(num1 / 10) * 10);

	}

}
