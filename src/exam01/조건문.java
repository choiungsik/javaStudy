package exam01;

import java.util.Scanner;

public class 조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if (조건식 ) {
		// 실행문장;
		// 실행문장;
		// } 중괄호 정렬할 때 ctrl+shift+f를 통해 자동정렬가능
		// 실행문장이 1개일 때 중괄호 없이 사용가능
		// 만약 여러개를 아래에 쓰더라도 바로 옆에 있는 것만 인식해서 실행함
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		if (num%15==0){
			System.out.println("3과 5의 공배수입니다.");
		}else if (num%3==0){
			System.out.println("3의 배수입니다.");
		}else if (num%5==0){
			System.out.println("5의 배수입니다.");
		}else {
			System.out.println("3과 5의 배수가 아닙니다.");
		}
	}
}
