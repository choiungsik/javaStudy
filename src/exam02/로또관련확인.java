package exam02;

import java.util.Random;

public class 로또관련확인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로또ㅜㅜㅜ
		// 추첨기 준비
		int[] lotto = new int[45];
		// 추첨기에 공을 넣는다.
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]); // pinrtf("%2d",lotto[i]) 2자리 정수값을 오른차순으로 정렬
			if ((i + 1) % 10 == 0) { // 10 단위로 줄바꿈 개꿀팁
				System.out.println();
			}
		}
		System.out.println("\n=============섞기전=============");

		// 추첨기의 공을 섞는다.
		// lotto[0]에 저장된 값과 lotto[1]~[44]사이의 랜덤한 위치의 값을 교환 한다.
		Random random = new Random();
		for (int i = 0; i < 1000000; i++) {
			int r = random.nextInt(44) + 1;
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;

		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}

		}
		System.out.println("\n=============섞은후=============");

		System.out.print("1등 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println("보너스 : " + lotto[6]);
	}
}