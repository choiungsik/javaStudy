package project1team;

import java.util.Arrays;

public class �ڹ�0605_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int[] result = new int[2];
		int dis = 0;
		int min = 999;
//		int[][] test = new int[3][3];

		// �� ����� �Ÿ��� �����ϱ� ���� �� ���� ���밪���� ��ȯ�ؼ� ���� ���� ���� ������
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

		// ������ ���� ������ �Ÿ��� ��ġ�ϴ� ������
		// �迭�� ���� �����صΰ� �迭 ��ä�� �����
		System.out.print("result = ");
		System.out.println(Arrays.toString(result));
		// ���߹迭�� ǥ���� ������ �ٸ� ��ɾ�� ����ؾ� ����
		// System.out.println(Arrays.deepToString(test));
	}
}
