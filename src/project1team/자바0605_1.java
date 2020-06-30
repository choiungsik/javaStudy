package project1team;

import java.util.Arrays;

public class 자바0605_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int[] result = new int[2];
		int dis = 0;
		int min = 999;
//		int[][] test = new int[3][3];

		// 각 요소의 거리를 측정하기 위해 뺀 값을 절대값으로 변환해서 가장 작은 값을 추출함
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				if (i != j) {
					dis = point[i] - point[j];
					if (Math.abs(dis) < Math.abs(min)) {
						min = dis;
						result[0] = i;
						result[1] = j;
					}
				}
			}
		}
//		
//		for (int i = 0; i < test.length; i++) {
//			test[i][i] = i;
//		}

		// 추출한 작은 값으로 거리가 일치하는 요소출력
		// 배열에 값을 저장해두고 배열 통채로 출력함
		System.out.print("result = ");
		System.out.println(Arrays.toString(result));
		// 다중배열을 표현할 때에는 다른 명령어로 사용해야 나옴
		// System.out.println(Arrays.deepToString(test));
	}
}
