package project1team;

import java.util.Scanner;

public class 자바0611_4뭐냐이건 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("뛰어갈 칸의 총 수 : ");
		int n = scan.nextInt();
		System.out.println(jumpCase(n));

	}

	public static int jumpCase(int num) {

		// 2로 뛴 수를 구하기 위해 num의 절반 값에서 부터 2로 뛴수 j 값 탐색
		int two = num / 2;
		int result = 0;

		for (int j = two; j >= 0; j--) {
			double np = 1;
			double rp = 1;
			double n_rp = 1;
			// one은 2로 뛴 것을 제외한 나머지수 즉 1로 뛴 수를 의미
			int one = num - (j * 2);
			// 1로 뛴 것과 2로 뛴 것을 합쳐서 모두 곱해야하므로 별도 값 n에 저장
			int n = one + j;
			// j를 밖에서 쓰기 위해? 별로 필요 없을듯 어차피 전부 j의 for문 안에서 활용
			//int r = j;

			// 경우의 수를 구하기 위한 n의 팩토리얼
			for (int i = n; i > 0; i--) {
				np *= i;
			}
			// 경우의 수를 구하기 위한 2로 뛴 j의 팩토리얼
			for (int i = j; i > 0; i--) {
				rp *= i;
			}
			// 경우의 수를 구하기 위한 2를 제외한 1로 뛴 n-r의 팩토리얼
			for (int i = n - j; i > 0; i--) {
				n_rp *= i;
			}
			result += np / rp / n_rp;
		}
		return result;
	}
}
