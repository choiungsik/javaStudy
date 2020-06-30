package project1team;

import java.util.Scanner;

public class 자바0605_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int num = scan.nextInt();
		String str = "";
		int count = 0;

		// pow를 사용해서 입력값보다 큰 2의 i승 값을 찾음
		// i는 10진수를 2진수로 바꾸었을 때 나오는 수로 10진수의 크기로 볼 수 있음 ex)10 < 16(2의 4승) = 10은 4자리수로 표현가능
		for (int i = 0; i < num; i++) {
			if (num < Math.pow(2, i)) {
				// 나온 자리수를 이 문장 밖에서 쓸 수 있는 변수에 담고 문장은 종료
				count = i;
				break;
			}
		}
		// 2로 나누어 떨어지면 0, 나눠서 1이 남으면 1로 표현해서 각 값을 나온값 뒤에 넣기 위해 문자형태로 저장
		for (int i = 0; i < count; i++) {
			if (num % 2 == 0) {
				str = "0 " + str;
				num /= 2;
			} else if (num % 2 == 1) {
				str = "1 " + str;
				num /= 2;
			}
		}
		System.out.println(str);
	}
}
