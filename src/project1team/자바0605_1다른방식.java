package project1team;

public class �ڹ�0605_1�ٸ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int dis = 0;
		int min = 999;
		int point1 = 0;
		int point2 = 0;

		// �ּҰ��� �̸��� ���� �����ؼ� �� ���� ã�ư��� ���
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				if (i != j) {
					dis = point[i] - point[j];
					if (min > Math.abs(dis)) {
						min = Math.abs(dis);
						point1 = i;
						point2 = j;
					}
				}
			}
		}
		System.out.print("result = ["+point1+", "+point2+"]");
	}

}
