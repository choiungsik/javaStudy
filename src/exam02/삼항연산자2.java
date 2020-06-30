package exam02;

import java.util.Scanner;

public class 삼항연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 입력 : ");
		int num1 = scan.nextInt();
		System.out.println("두 번째 정수 입력 : ");
		int num2 = scan.nextInt();
		
		int res = num1 > num2 ? num1-num2 : num2-num1;
		System.out.println("두 수의 차 : "+res);
	}

}
