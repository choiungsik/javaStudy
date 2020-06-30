package frist;

import java.util.Scanner;

public class 합불시스템 {

	public static void main(String[] args) {
		// 정보처리기사의 각 과목의 정답개수를 int형 타입의 변수 5개를 선언하고 입력받으세요.
//		      한 과목이라도 8개 미만인 경우, “불합격입니다!”를 출력하고 총 개수가 60개 
//		      이상이면 “합격입니다!”를 출력하는 프로그램을 만들어보세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("소프트웨어 설계 >>");
		int a = sc.nextInt();
		System.out.print("소프트웨어 개발 >>");
		int b = sc.nextInt();
		System.out.print("데이터베이스 구축 >>");
		int c = sc.nextInt();
		System.out.print("프로그래밍 언어 활용 >>");
		int d = sc.nextInt();
		System.out.print("정보시스템 구축관리 >>");
		int f = sc.nextInt();

		int sum = a + b + c + d + f;

		if (a < 8 || b < 8 || c < 8 || d < 8 || f < 8 || sum < 60) {
			System.out.println("불합격 입니다!");
		} else {
			System.out.println("합격 입니다!");
		}
	}

}