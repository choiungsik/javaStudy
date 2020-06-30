package exam01;

import java.util.Scanner;

public class do_while문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반드시 1번은 실행시키고 while의 조건문을 점검해서 진행함

		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int p_m = 0;
		String select;

		do {
			System.out.print("첫 번째 정수를 입력하세요 >> ");
			num1 = scan.nextInt();
			System.out.print("두 번째 정수를 입력하세요 >> ");
			num2 = scan.nextInt();
			System.out.print("[1]더하기 [2]빼기 >> ");
			p_m = scan.nextInt();
			if (p_m == 1) {
				System.out.println("더하기 연산 결과는 " + (num1 + num2) + "입니다.");
			} else if (p_m == 2) {
				System.out.println("빼기 연산 결과는 " + (num1 - num2) + "입니다.");
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.print("다시 실행하시겠습니까? (Y/N)");
			select = scan.next();
			// select는 문자열이므로 int형태에서 사용하는 == 가 아닌 equals를 사용해서 동일하다는 조건을 확인시켜야한다.
			// 만약에 char 형태로 구성했으면 문자는 ''로 표시해야 인식할 수 있다.
		} while (select.equals("Y") );
		System.out.println("종료합니다.");
	}

}
