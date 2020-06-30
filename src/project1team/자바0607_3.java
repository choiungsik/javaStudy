package project1team;

public class 자바0607_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char list1[][] = new char[5][5];
		int num = 64;
		int k2 = 0;
		// 아스키코드에서 "A"=65이므로 64부터 1씩 증가한 값을 문자형태로 치환시 알파벳 출력가능
		
		for (int i = 0; i < 3; i++) {
			// 빈칸은 \t를 통해서 놓을시 다른 문자들과 열을 맞춰 보기좋은 상태로 정렬  
			for (int k = 0; k < k2 - i; k++) {
				System.out.printf("%s ", " ");
			}
			k2 += 2;

			// 한열을 작성할 때마다 양쪽이 비어야하므로 앞은 +, 뒤는 -시켜서 출력횟수 조절
			for (int j = 0 + i; j < 5 - i; j++) {
				if (i <= 2) {
					num++;
					list1[i][j] = (char) num;
					System.out.printf("%s ",list1[i][j]);
				}
			}
			System.out.println();
		}

		// 2번째 열 이후에는 다시 역으로 증가하는 식으로 바뀌어야 원하는 모래시계 형태가 나옴
		for (int i = 3; i < 5; i++) {
			// 앞에서 k2값이 6이 되어 있는 상태이므로 이를 뺄 값을 정해줘야 내려가는 값에 맞게 빈칸형성
			// %1$s 포맷팅을 할 때 문자열은 %s로 진행하는데 만약 여러 문자가 있으면 1$는 첫번째 문자, 2$는 두번째 문자를 포맷하라는 소리
			for (int k = k2 - i - 3; k >= 0; k--) {
				System.out.printf("%s ", " ");
			}

			for (int j = 4 - i; j < 1 + i; j++) {
				if (i <= 5) {
					num++;
					list1[i][j] = (char) num;
					System.out.printf("%s ",list1[i][j]);
				}
			}
			System.out.println();
		}
	}
}
