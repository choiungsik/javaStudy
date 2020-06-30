package project1team;

public class 자바0606_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list1[][] = new int[7][7];
		int num = 0;

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				// 합이 2보다 작은 (0, 2), (1, 1), (2, 0)의 값 미출력
				// 합이 10보다 큰 (4, 6), (5, 5), (6,4)의 값 미출력
				// 차의 절대값(+, -)이 4보다 작은 양쪽 끝 값 미출력
				if (i+j >2 && i+j<10 && Math.abs(i-j)<4) {
					num++;
					list1[i][j] = num;
					System.out.printf("%2d ",list1[i][j]);
				}else {
					System.out.printf("%2d ",list1[i][j]);
				}
			}
		System.out.println();
		}
	}
}
